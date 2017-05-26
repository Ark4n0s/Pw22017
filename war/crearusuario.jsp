<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<%
	List<Tipos> todosTipos = TiposUtil.todosLosTipos();
	List<Usuarios> todosUsuarios = UsuariosUtil.todosLosUsuarios();
%>
<html>
<head>
<script type="text/javascript" src="js/jquery.js"></script>


<link rel="stylesheet" type="text/css" href="estilos/estilos.css">
<link rel="stylesheet" href="css/layout.css" type="text/css">
</head>
<body id="top">

	<div class="wrapper">
		<div id="footer" class="clear">
			<div class="fl_left" style="text-align: center">
				<div id="tabcontainer" class="border">
					<a href="/index2.html">REGRESAR AL MENU PRINCIPAL</a><br> <a
						href="/mostrarusuarios.jsp">MOSTRAR TODOS LOS USUARIOS</a><br>
				</div>

				<br>
				<div id="contact" class="clear">
					<form id="usuario">
						<div class="fl_left">
							Ingrese Nombre Usuario: <input type="text" name="nombreusuario"
								placeholder="ingrese nombre de usuario"><br>
							Ingrese Email: <input type="text" name="email"
								placeholder="ingrese email"><br> Ingrese Tipo: <select
								name="idtipo">
								<%
									for (Tipos t : todosTipos) {
								%>
								<option value=<%=t.getIdTipo()%>><%=t.getTipo()%></option>
								<%
									}
								%>
							</select> <br><br>
							<button type="reset" onclick="Limpiar()">
								<span>LIMPIAR</span>
							</button>
							<button type="submit">
								<span>REGISTRAR</span>
							</button>
						</div>
					</form>
				</div>
				<br>
				<div id="us"></div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		function Limpiar() {
			document.getElementById("us").innerHTML = "";

		}
	</script>
	<script type="text/javascript" src="js/ajax.js"></script>
</body>



</html>