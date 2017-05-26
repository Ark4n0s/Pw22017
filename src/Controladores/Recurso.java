package Controladores;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelos.RecursosUtil;


@SuppressWarnings("serial")
public class Recurso extends HttpServlet {
 public void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	
	 String nombreRecurso=req.getParameter("nombre");
	 
	
	 RecursosUtil.insertarRecurso(nombreRecurso);
	 resp.getWriter().println("SE INSERTO CORRECTAMENTE EL RECURSO");
	 
	 
 }
}