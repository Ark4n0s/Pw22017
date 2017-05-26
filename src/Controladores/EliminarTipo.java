package Controladores;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelos.TiposUtil;


@SuppressWarnings("serial")
public class EliminarTipo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		Long idtipo=Long.parseLong(req.getParameter("idtipo"));
    	TiposUtil.BorrarTipo(idtipo);
		resp.getWriter().println("TIPO BORRADO CORRECTAMENTE");


	}
}