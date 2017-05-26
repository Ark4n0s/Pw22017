<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<%
	List<Recursos> todosRecursos = RecursosUtil.todosLosRecursos();
	List<Usuarios> todosUsuarios = UsuariosUtil.todosLosUsuarios();
%>
<html>
<head>
<script type="text/javascript" src="js/jquery.js"></script>
<link rel="stylesheet" href="css/layout.css" type="text/css">
</head>
<body>
	<div class="wrapper">
		<div id="footer" class="clear">
			<div class="fl_left" style="text-align: center">
				<div id="tabcontainer" class="border">
					<a href="/admin.jsp">REGRESAR AL MENU PRINCIPAL</a><br> <a
						href="/eligiendopermisos.jsp">MOSTRAR TODOS LOS PERMISOS</a><br>
<br><br>
					<form id="permiso">

						Ingrese Usuario: <select name="idusuario">
							<%
								for (Usuarios u : todosUsuarios) {
							%>
							<option value=<%=u.getIdUsuario()%>><%=u.getNombre()%></option>
							<%
								}
							%>
						</select><br><br> Ingrese Recurso: <select name="idrecurso">
							<%
								for (Recursos r : todosRecursos) {
							%>
							<option value=<%=r.getIdRecurso()%>><%=r.getRecurso()%></option>
							<%
								}
							%>
						</select> <br><br> Ingrese Permiso: <select name="permiso">
							<option value=<%=true%>><%="DAR PERMISO"%></option>
							<option value=<%=false%>><%="NO DAR PERMISO"%></option>

						</select>
<br><br>
						<button type="submit">
							<span>REGISTRAR</span>
						</button>
						<button type="reset" onclick="Limpiar()">
								<span>LIMPIAR</span>
							</button>
					</form>
					<br><br>
					<div id="perm"></div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function Limpiar() {
			document.getElementById("perm").innerHTML = "";

		}
	</script>
	
	<script type="text/javascript" src="js/ajax.js"></script>
</body>



</html>