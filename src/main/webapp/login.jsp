<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es">
  <head>
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Asesorias en Prevencion de Riesgos</title>
  </head>
  <header>
    <div class="">
        <nav class="navbar navbar-expand-lg navbar-dark bg-success fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Asesorias</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>            
                <div class="collapse navbar-collapse" id="navbarScroll">
                    <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
	                    <li class="nav-item">
	                        <a class="nav-link active" aria-current="page" href="inicio">Inicio</a>
	                    </li>                        
                    </ul>                 
                </div>   
            </div>         
        </nav>
    </div>
  </header>

  <br>
  <br>
    
  <body>
    <br>
    <br>
    <div class="position-relative">  
        <h1 class="text-center">Asesorias en Prevencion de riesgos</h1>
    </div>
    <br>
    <br>     
    <br>
     
    
    <div class="row row-cols-1 row-cols-md-1">
        <div class="col">
          <div class="card h-100 bg-success mx-auto" style="width: 400px;">          	          
            <div class="card-body ">
              <h5 class="card-title text-center">Iniciar Sesión</h5>
              <form action="Login" method="post">
                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="usuario" placeholder="Usuario">
                  </div>
                </div>
                <div class="row mb-3">
                  
                  <div class="col-sm-10 mx-auto">
                    <input type="password" class="form-control" name="password" placeholder="Password">
                  </div>
                </div>   
                
                <div class="col-sm-10 mx-auto text-center">
                  <button type="submit" class="btn btn-dark col-sm-5">Ingresar</button> 
                  <button type="reset" class="btn btn-dark col-sm-5">Limpiar</button>                                        
                </div>                
              </form>
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