<%@page import="Controladores.*"%>
<%@page import="BD.*"%>
<%@page import="Modelos.*"%>
<%@page import="java.util.*"%>

<% Permisos p=(Permisos)request.getAttribute("permiso");
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
<a href="/admin.jsp">REGRESAR AL MENU PRINCIPAL</a><br>
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