<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<% List<Usuarios>usuarios=UsuariosUtil.todosLosUsuarios(); %>
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
<a href="/admin.jsp">REGRESAR AL MENU PRINCIPAL</a><br>
</div>
</div>
</div>

	<div class="gridtable">
	<table>
			<tr>
				<th>ID</th>
				<th>NOMBRE USUARIO</th>
				<th>EMAIL</th>
                <th>BORRAR USUARIO</th>
			</tr>		<%
							for (Usuarios u:usuarios) {
						%>
									
				<tr>						
						<td><%=u.getIdUsuario()%></td>
						<td><%=u.getNombre()%></td>
						<td><%=u.getEmail()%></td>
						<td><a href=eliminarusuario?idusuario=<%=u.getIdUsuario()%>>ELIMINAR USUARIO</a></td>											
				</tr>
					
					<%
						}
					%>
			</table>	
			</div>		
			</div>		
</body>	 
</html>