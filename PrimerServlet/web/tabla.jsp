<%@page import="conexion.UsuariosAcciones"%>
<%@page import="conexion.ClaseConexion"%>
<%@page import="usuarios.Usuario"%>
<%@page import="java.util.List"%>
<%
     ClaseConexion con = new ClaseConexion();
     UsuariosAcciones ua = new UsuariosAcciones(con);
     List<Usuario> lista = ua.getUsuarios(); 
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
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
          <button class="btn btn-dark my-2 my-sm-0" >Logout</button>
        </nav>
    </form>
    
    <table class="table table-striped">
        <thead>
          <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido paterno</th>
            <th scope="col">Apellido materno</th>
            <th scope="col">Correo</th>
          </tr>
        </thead>
        <tbody>
          <% for(Usuario usr : lista) {%>
            <tr>
                <td><%= usr.getNombre() %></td>
                <td><%= usr.getApaterno() %></td>
                <td><%= usr.getAmaterno() %></td>
                <td><%= usr.getCorreo() %></td>
            </tr>
          <%}%>
        </tbody>
      </table>
    







  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>