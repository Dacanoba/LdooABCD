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
    </head>
    <body>
        <form action="ControladorUsers" method="POST">
            <label>Username</label> <input type="text" name="TxtRegUname"><br>
            <label>Password</label> <input type="password" name="TxtRegPword"><br>
            <input type="hidden" value="Registro" name="action">
            <input type="submit" name="Registrate">
        </form>
    </body>
</html>
