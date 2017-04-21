<%-- 
    Document   : Register
    Created on : Apr 20, 2017, 4:46:35 AM
    Author     : mendezgonzalez.9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register!</title>
        <link href="Style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="cuerpo">
        <form class="formas"  action="ControladorUsers" method="POST">
            <label>Username:</label> <input style ="margin-left: -5px;"class="buscar" type="text" name="TxtRegUname"><br>
            <label>Password:</label> <input style ="margin-left: -1px;"class="buscar"  type="password" name="TxtRegPword"><br>
            <label>Email:</label> <input style ="margin-left: 22px;"class="buscar" type="text" name="TxtRegEmail"><br>
            <img  class ="imagenDerecha" src="Perio.png" alt=""/>
            <input type="hidden" value="Registro" name="action">
            <input class="input" type="submit" value="Registrate"name="Registrate">
        </form>
    </body>
</html>
