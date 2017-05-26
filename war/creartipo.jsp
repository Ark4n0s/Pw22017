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
<a href="/mostrartipos.jsp">MOSTRAR TODOS LOS TIPOS</a><br>
<div id="contact" class="clear">
<form id="tipo">
Ingrese Tipo: <input type="text" name="nombre"><br>
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
<div id="tip"></div>

</div>
</div>
</div>
</div>
<script type="text/javascript">
		function Limpiar() {
			document.getElementById("tip").innerHTML = "";

		}
	</script>

<script type="text/javascript" src="js/ajax.js"></script>
</body>




</html>