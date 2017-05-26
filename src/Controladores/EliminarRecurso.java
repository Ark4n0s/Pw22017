package Controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.Permisos;
import Modelos.PermisosUtil;
import Modelos.RecursosUtil;


@SuppressWarnings("serial")
public class EliminarRecurso extends HttpServlet {
 public void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	
	 Long idrecurso=Long.parseLong(req.getParameter("idrec"));
	 RecursosUtil.BorrarRecurso(idrecurso);
	 
	List<Permisos>per= PermisosUtil.todosLosPermisos();
	 for(Permisos p:per){
		 for(int i=0;i<p.getIdRecursos().size();i++){
			 if(idrecurso.equals(p.getIdRecursos().get(i))){
				 p.getIdRecursos().remove(i);
				 
			 }
			 
		 }		 
	 }
	 
	 
	 resp.getWriter().println("RECURSO BORRADO CORRECTAMENTE");
	 
	 
 }
}