<%-- 
    Document   : registro
    Created on : 29-sep-2021, 19:36:01
    Author     : itsai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registrar nuevo usuario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link  href="css/forms_style.css" rel="stylesheet">
    </head>
    <body>
        <form  action="NavbarController" method="post">
            <nav class="navbar navbar-expand-lg  navbar-light bg-dark " action="ControlIndex">
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
                      <button class=" btn btn-dark text-white" name="btnTablaUsuarios">Ver usuarios</button> 
                  </li>
                </ul>
              </div>
            </nav>
        </form>

    <center>
            
            <form action="servlet_uno" name="formulario" method="post" class="form__registro">
                 <p >Registro</p>
                <div class="form-group">
                        <div class="form-row">
                             <div class="col">
                                  <input type="text" class="form-control" name="nombre"  placeholder="Nombre">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control" name="apaterno"  placeholder="Apellido paterno">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control"  name="amaterno" placeholder="Apellido materno">
                                </div>
                        </div>
                </div>
                
                <div class="form-group">
                        <div class="form-row">
                             <div class="col">
                                  <input type="text" class="form-control" name="correo"  placeholder="Correo">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control" name="username"  placeholder="Nombre de usuario">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control"  name="password" placeholder="Contraseña">
                                </div>
                        </div>
                <button type="submit" class="btn btn-outline-success espacio" onclick="return validarGuardar();" name="btnGuardar">Guardar</button>
                </div>
            </form> 
        </div>
</center>
    
        <script type="text/javascript">
            function validarGuardar(){
                if(document.formulario.nombre.value.length <= 0){
                    alert('Ingresar nombre');
                    document.formulario.nombre.focus();
                    return false;
                }else
                if(document.formulario.apaterno.value.length <= 0){
                    alert('Ingresar apellido paterno');
                    document.formulario.apaterno.focus();
                    return false;
                }else
                if(document.formulario.amaterno.value.length <= 0){
                    alert('Ingresar apellido materno');
                    document.formulario.amaterno.focus();
                    return false;
                }else
                if(document.formulario.correo.value.length <= 0){
                    alert('Ingresar un correo');
                    document.formulario.correo.focus();
                    return false;
                }else
                if(document.formulario.username.value.length <= 0){
                    alert('Ingresar tu nombre de usuario');
                    document.formulario.username.focus();
                    return false;
                }else
                if(document.formulario.password.value.length <= 0){
                    alert('Ingresar contraseña');
                    document.formulario.password.focus();
                    return false;
                }else{
                    return true;
                }
            }
        </script>
        
     <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
 
    </body>
</html>
