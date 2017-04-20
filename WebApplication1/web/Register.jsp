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
    <body>
        <form class="formas"  action="ControladorUsers" method="POST">
            <label>Username</label> <input class="buscar" type="text" name="TxtRegUname"><br>
            <label>Password</label> <input class="buscar"  type="password" name="TxtRegPword"><br>
            <input type="hidden" value="Registro" name="action">
            <input class="input" type="submit" name="Registrate">
        </form>
    </body>
</html>
