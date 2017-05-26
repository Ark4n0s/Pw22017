<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<%
	List<Usuarios> usuarios = UsuariosUtil.todosLosUsuarios();
%>
<html>
<head>
<link rel="stylesheet" href="css/layout.css" type="text/css">
</head>
<body>
	<div class="wrapper">
		<div id="footer" class="clear">
			<div class="fl_left" style="text-align: center">
				<div id="tabcontainer" class="border">
					<a href="/admin.jsp">REGRESAR AL MENU PRINCIPAL</a><br>
				</div>
				<form action="/verpermisos" method="get">
					ELIJA USUARIO PARA VER SUS PERMISOS: <br>
					<br> <select name="idusuario">
						<%
							for (Usuarios u : usuarios) {
						%>
						<option value=<%=u.getIdUsuario()%>><%=u.getNombre()%></option>
						<%
							}
						%>
					</select> <br><br>
					<button type="submit">
						<span>Ver Usuario</span>
					</button>

				</form>
			</div>
		</div>
	</div>
</body>
</html>