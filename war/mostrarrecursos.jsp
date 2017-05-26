<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<% List<Recursos>rec=RecursosUtil.todosLosRecursos(); %>
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
				<th>NOMBRE RECURSO</th>
				<th>BORRAR RECURSO</th>

			</tr>		<%
							for (Recursos re:rec) {
						%>
									
				<tr>						
						<td><%=re.getIdRecurso()%></td>
						<td><%=re.getRecurso()%></td>
						<td><a href=eliminarrecurso?idrec=<%=re.getIdRecurso()%>>ELIMINAR RECURSO</a></td>											
				</tr>
					
					<%
						}
					%>
			</table>	
			</div>	
			</div>			
</body>	 
</html>