<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<%
  String email= (String)getServletContext().getAttribute("email");
List<Usuarios> usuarios = UsuariosUtil.todosLosUsuarios();
Long idusuario=null;
if(email!=null){
for(Usuarios us:usuarios){
	if(us.getEmail().equals(email)){
		idusuario=us.getIdUsuario();
	
	}
	
}}
if(idusuario!=null){
Permisos p=PermisosUtil.BuscarPorIdPermiso(idusuario);
List<Long>idrec=p.getIdRecursos();
	
%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="estilos/estilos.css">
<link rel="stylesheet" href="css/layout.css" type="text/css">
</head>
<body>
<div class="wrapper">
<div id="footer" class="clear">
			<div class="fl_left" style="text-align: center">
				<div id="tabcontainer" class="border">
<br> <a href="/gmailservlet">REGRESAR</a><br> <br>
</div>
</div>
</div>
	<div class="gridtable">
	<table>
			<tr>
				
			<th><%=UsuariosUtil.BuscarPorIdUsuarios(p.getIdUsuario()).getNombre()%></th>
             <th><%=UsuariosUtil.BuscarPorIdUsuarios(p.getIdUsuario()).getEmail()%></th>    
			</tr>		
			
			<tr>
				
			<th>Nombre de Recurso</th>
		
            <th>Permiso</th>
            
			</tr>	
			
			
			
			<%
							for (int i=0;i<idrec.size();i++) {
						%>
									
				<tr>						
						<td><%=RecursosUtil.BuscarPorIdRecurso(p.getIdRecursos().get(i)).getRecurso()%></td>
						
						<td><%=p.getPermisos().get(i)%></td>
																
				</tr>
					
					<%
						}
					%>
			</table>	
			</div>	
			</div>			
</body>	 
</html>
<%}else{%>
<h1>NO TIENE PERSONAJE</h1>
<%}%>