<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <div class="position-relative">  
        <h1 class="text-center">Nuevo Usuario</h1>
    </div>
    <br>
    <br>     
    <br>
    
    <div class="row row-cols-1 row-cols-md-1">
        <div class="col">
          <div class="card h-100 bg-success mx-auto" style="width: 400px;">            
            <div class="card-body ">
              <h5 class="card-title text-center">Crear Usuario</h5>              
                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <p>Usuario Creado!</p>
                  </div>                                                                        
                </div>
            </div>            
          </div>
        </div>
    </div>
    
    <br>
    <br>     
    <br>
    
	<!-- Footer -->
    <%@ include file="footer.jsp" %>
    <!-- Footer -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    
  </body>
</html>