<%-- 
    Document   : admin
    Created on : 22-sep-2021, 21:42:49
    Author     : itsai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link  href="css/style.css" rel="stylesheet">
        <title>Admin page</title>
    </head>
    <body>
        <form  action="NavbarController" method="post">
        <nav class="navbar navbar-expand-lg  navbar-light bg-dark justify-content-between" action="ControlIndex">
            <button class="navbar-brand btn btn-dark text-white" name="btnInicio">Inicio</button>  
            <button class=" navbar-brand navbar-toggler text-white" type="button" data-toggle="collapse" 
                    data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" 
                    aria-label="Toggle navigation">Menu</button>
          <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
              <li class="nav-item dropdown">
                  <div class="btn-group">
                      <button class="btn btn-dark dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           Acciones usuarios
                      </button>
                      <div class="dropdown-menu">
                        <button class="dropdown-item" name="btnIrRegistro">Registrar</button>
                      </div>
                    </div>
              </li>
               <li class="nav-item">
                    <button class="btn btn-dark text-white" name="btnTablaUsuarios">Ver usuarios</button> 
               </li>
            </ul>
          </div>
        </nav>
        </form>
        <h2 class="h2">Hola: ${labelNombre}</h2>
        
        
        <footer class="navbar navbar-fixed-bottom bg-dark text-center text-white">
            <div class="text-center p-4">
              © 2020 Copyright:
              <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
            </div>
         </footer>
        
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
 
    </body>
</html>
