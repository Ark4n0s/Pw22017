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
<a href="/index2.html">REGRESAR AL MENU PRINCIPAL</a><br>
<a href="/mostrarrecursos.jsp">MOSTRAR TODOS LOS RECURSOS</a><br><br>
<div id="contact" class="clear">
<form id="recurso">
Ingrese Nombre Recurso: <input type="text" name="nombre"><br>
<button type="reset" onclick="Limpiar()">
								<span>LIMPIAR</span>
							</button>
							<button type="submit">
								<span>REGISTRAR</span>
							</button>
</form>
<br>
<br><br>

</div>
<div id="rec"></div>

</div>
</div>
</div>
</div>
<script type="text/javascript">
		function Limpiar() {
			document.getElementById("rec").innerHTML = "";

		}
	</script>

<script type="text/javascript" src="js/ajax.js"></script>
</body>




</html>