package Controladores;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class GmailServletOut extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		//BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

		UserService us = UserServiceFactory.getUserService();
		us.createLogoutURL(req.getRequestURI());
		resp.sendRedirect("/index.html");
	}
}