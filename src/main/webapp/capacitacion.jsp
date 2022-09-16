<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="es">
  <head>
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

	<!--Librería jQuery-->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script> 
	<!--Plugin jQuery Validate-->
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.js"></script>
	
	<!--Incluir las diferentes reglas de validacion-->
	<script>
		//Este mensaje de alerta es unicamente a modo de prueba para prevenir que se envie el formulario
		//Una vez configuradas las reglas de validacion y los mensajes se puede eliminar
		// -- ELIMINAR DESDE ACA --
		//$.validator.setDefaults({
		//	submitHandler: function() {
		//		//alert("enviado!");
		//	}
		//});
		// -- ELIMINAR HASTA ACA --

		$().ready(function() {
			// validate the comment form when it is submitted
			$("#capForm").validate({
				rules: {
					nombreCurso: {
						required: true,
						minlength: 5
					},
					nombreDocente: {
						required: true,
						minlength: 5
					},
					fechaInicio: {
						required: true						
					},
					fechaTermino: {
						required: true						
					},
					precio: {
						required: true						
					}
				},
				messages: {
					nombreCurso: {
						required: "Debe ingresar nombre del curso.",
						minlength: "El nombre del curso debe tener a lo menos 5 caracteres."
					},
					nombreDocente: {
						required: "Debe ingresar nombre del docente.",
						minlength: "El nombre del docente debe tener a lo menos 5 caracteres."
					},
					fechaInicio: "Debe ingresar la fecha de inicio.",
					fechaTermino: "Debe ingresar la fecha de termino.",
					precio: "Debe ingresar el precio.",
				}

			});
		});
	</script>

	<style type="text/css">
		form .error {
  		color: #df1d09;
  		border: 1px dotted #df1d09;
  		background-color: #D6F4D0;
}
  	</style>

    <title>Asesorias en Prevencion de Riesgos</title>
  </head>
  

  
    
  <body>
    <br>
  	<br>
  	<%@ include file='menu.jsp' %>
    <br>
    <br>
    <div class="position-relative">  
        <h1 class="text-center">Nueva Capacitacion</h1>
    </div>
    <br>
    <br>     
    <br>
     
    
    <div class="row row-cols-1 row-cols-md-1">
        <div class="col">
          <div class="card h-100 bg-success mx-auto" style="width: 400px;">            
            <div class="card-body ">
              <h5 class="card-title text-center">Crear Capacitacion</h5>
              <form id="capForm" action="ListarCapacitaciones" method="post" onsubmit='return validar();'>
                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="nombreCurso" placeholder="Nombre Curso" required>
                  </div>
                </div>

                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="nombreDocente" placeholder="Nombre Docente" required>
                  </div>
                </div>

                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="fechaInicio" placeholder="Fecha Inicio" required>
                  </div>
                </div> 
                
                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="fechaTermino" placeholder="Fecha Termino" required>
                  </div>
                </div>   

                <div class="row mb-3">                  
                  <div class="col-sm-10 mx-auto">
                    <input type="text" class="form-control" name="precio" placeholder="Valor Curso" required>
                  </div>
                </div>   
                
                <div class="col-sm-10 mx-auto text-center">
                  <button type="submit" class="btn btn-dark col-sm-5">Crear</button> 
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
    
    <!-- Para bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    
  </body>
</html>