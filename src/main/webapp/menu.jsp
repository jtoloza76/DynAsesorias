<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                    	<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Capacitacion</a>
							<ul class="dropdown-menu">
					            <li><a class="dropdown-item" href="capacitacion">Crear Capacitacion</a></li>
					            <li><a class="dropdown-item" href="ListarCapacitaciones">Lista Capacitaciones</a></li>						            
				          	</ul>
				        </li>
				        <li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Usuario</a>
							<ul class="dropdown-menu">
					            <li><a class="dropdown-item" href="CrearUsuario">Crear Usuario</a></li>					            
					            <li><a class="dropdown-item" href="ListadoUsuarios">Lista Usuarios</a></li>						            
				          	</ul>
				        </li>
                    	<li class="nav-item">
	                        <a class="nav-link" aria-current="page" href="contacto">Contacto</a>
	                    </li>                    	
                    </ul>   
                    <form action="Logout" class="d-flex">              
	                    <button class="btn btn-outline-dark" type="submit">Log Out</button>
                    </form>                 
                </div>   
            </div>         
        </nav>
    </div>
</header>