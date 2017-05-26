<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<% List<Tipos>tipos=TiposUtil.todosLosTipos(); %>
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
				<th>NOMBRE TIPO</th>
				<th>BORRAR TIPO</th>

			</tr>		<%
							for (Tipos t:tipos) {
						%>
									
				<tr>						
						<td><%=t.getIdTipo()%></td>
						<td><%=t.getTipo()%></td>
						<td><a href=eliminartipo?idtipo=<%=t.getIdTipo()%>>ELIMINAR TIPO</a></td>											
				</tr>
					
					<%
						}
					%>
			</table>	
			</div>	
			</div>			
</body>	 
</html>