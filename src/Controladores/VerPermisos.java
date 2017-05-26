package Controladores;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.Permisos;
import Modelos.PermisosUtil;

@SuppressWarnings("serial")
public class VerPermisos extends HttpServlet {
 public void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws IOException, ServletException {
	try{
	 Long idusuario=Long.parseLong(req.getParameter("idusuario"));
	 Permisos perm=PermisosUtil.BuscarPorIdPermiso(idusuario);
	 req.setAttribute("permiso", perm);
     RequestDispatcher rd=getServletContext().getRequestDispatcher("/mostrarpermisos.jsp");
	 rd.forward(req, resp);
	}catch(Exception e){resp.getWriter().println("NO EXISTE TAL USUARIO");}
 }
}