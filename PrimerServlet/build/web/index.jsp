<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="yiewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="favicon.ico">
        <title>Ingresar como Administrador</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link  href="css/forms_style.css" rel="stylesheet">
        
    </head>
    <body class="body">
      
        
        <form class="form__login" method="post" action="AdminController">
                <p class="h2 text-box">Ingreso al sistema</p>
                <input type="text" id="user" name="user" class="form-control espacio" placeholder="Usuario" required autofocus>
                <input type="password" id="pass" name="pass" class="form-control espacio" placeholder="Contraseña" required autofocus>
                <p class="text-danger">${message}</p>
                <button class="btn  btn-dark btn-block espacio" name="btnLogin" type="submit">Login</button>
                <a class="btn  btn-dark btn-block espacio" name="btnIrRegistro" type="submit">Registrarse</a>
         </form>
       
        
                
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
 
    </body>
</html>