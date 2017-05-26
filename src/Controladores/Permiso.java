package Controladores;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.Permisos;
import Modelos.PermisosUtil;




@SuppressWarnings("serial")
public class Permiso extends HttpServlet {
 public void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	try{
	 Long idusuario=Long.parseLong(req.getParameter("idusuario"));
	 Long idrecurso=Long.parseLong(req.getParameter("idrecurso"));
	 Boolean permiso=Boolean.parseBoolean(req.getParameter("permiso"));
	 
	 Permisos perm=PermisosUtil.BuscarPorIdPermiso(idusuario);
	 Boolean existe=false;
	 int posicion=0;
	 int i=0;
	 for(Long id:perm.getIdRecursos()){
		 if(id.equals(idrecurso)){
			 existe=true;
			 posicion=i;
		 }
		 i++;
	 }
	 
	 
	 if(existe==false){ perm.setIdRecursos(idrecurso);
	 perm.setPermisos(permiso);}
	if(existe==true){
		perm.getPermisos().set(posicion, permiso);
		
	}
	 		 
	 resp.getWriter().println("SE INSERTO CORRECTAMENTE EL PERMISO");
	 
	}catch(Exception e){resp.getWriter().println("INGRESE TODOS LOS CAMPOS CORRECTAMENTE");}
 }
}