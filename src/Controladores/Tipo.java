package Controladores;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelos.TiposUtil;

@SuppressWarnings("serial")
public class Tipo extends HttpServlet {
 public void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	
	 String nombreTipo=req.getParameter("nombre");
	 
	
	 TiposUtil.insertarTipo(nombreTipo);
	 resp.getWriter().println("SE INSERTO CORRECTAMENTE EL TIPO DE USUARIO");
	 
	 
 }
}