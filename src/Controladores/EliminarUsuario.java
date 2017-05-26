package Controladores;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelos.UsuariosUtil;


@SuppressWarnings("serial")
public class EliminarUsuario extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		Long idusuario=Long.parseLong(req.getParameter("idusuario"));
    	UsuariosUtil.BorrarUsuario(idusuario);
		resp.getWriter().println("USUARIO BORRADO CORRECTAMENTE");


	}
}