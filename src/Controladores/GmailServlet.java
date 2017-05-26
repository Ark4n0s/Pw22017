package Controladores;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class GmailServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		//BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

		UserService us = UserServiceFactory.getUserService();
		User user = us.getCurrentUser();
		

		if(user == null){
			resp.sendRedirect(us.createLoginURL(req.getRequestURI()));
		}else if(user.getEmail().equals("rescobedo@unsa.edu.pe")){
			resp.sendRedirect("/index2.html");

		}else{
			getServletContext().setAttribute("email", user.getEmail());
			resp.sendRedirect("/index.html");

		}
	}
}