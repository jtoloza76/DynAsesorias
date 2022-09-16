<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="dynAsesorias.modelo.Capacitacion" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!doctype html>
<html lang="es">
  <head>
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Asesorias en Prevencion de Riesgos</title>
  </head>
  
    
  <body>
    <br>
  	<br>
  	<%@ include file='menu.jsp' %>
    <br>
    <br>
    <div class="container">
    <div class="card card-custom gutter-b">
      <div class="card-header">
        <div class="card-title">
          <h1>Listado de Capacitaciones</h1>
        </div>
        <div class="card-body">
          <table class="table">
            <thead class="table-success">
              <tr>
                <th>Nombre Curso</th>
                <th>Nombre Docente</th>                
                <th>Fecha Inicio</th>
                <th>Fecha Termino</th>
                <th>Precio</th>                                
              </tr>
            </thead>    
            <tbody> 
            	<c:forEach var="cap" items="${capa}">             
	                <tr>                  
						<td><c:out value="${cap.getNombreCurso()}"></c:out></td>
						<td><c:out value="${cap.getNombreDocente()}"></c:out></td> 
						<td><c:out value="${cap.getFechaInicio()}"></c:out></td>
						<td><c:out value="${cap.getFechaTermino()}"></c:out></td>
						<td><c:out value="${cap.getPrecio()}"></c:out></td>                                    
	                </tr>              
	        	</c:forEach>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
    <br>
    <br> 

    <!-- Footer -->
    <%@ include file='footer.jsp' %>
    <!-- Footer -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    
  </body>
</html>