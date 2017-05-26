package Controladores;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.Usuarios;
import Modelos.UsuariosUtil;

@SuppressWarnings("serial")
public class Usuario extends HttpServlet {
 public void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	try{
	 String nombreUsuario=req.getParameter("nombreusuario");
	 String email=req.getParameter("email");
	 Long idTipo=Long.parseLong(req.getParameter("idtipo"));
	
	 List<Usuarios>us=UsuariosUtil.todosLosUsuarios();
	 Boolean cierto=true;
	 for(Usuarios u:us){
		 if(u.getEmail().equals(email)){
			 
			 u.setNombre(nombreUsuario);
			 u.setIdTipo(idTipo);
			 cierto=false;
		 }
		 
	 }
	 
	 
	 if(cierto==true){
	 UsuariosUtil.insertarUsuario(nombreUsuario, email, idTipo);
	 resp.getWriter().println("SE INSERTO CORRECTAMENTE EL USUARIO");
	 }
	 if(cierto==false){
	 resp.getWriter().println("SE CORRIGIO CORRECTAMENTE AL USUARIO");
	 }
	
	}catch(Exception e){resp.getWriter().println("INSERTE TODOS LOS CAMPOS CORRECTAMENTE");}
	
 }
}