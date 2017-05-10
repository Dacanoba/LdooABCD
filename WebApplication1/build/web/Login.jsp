<%-- 
    Document   : Register
    Created on : Apr 20, 2017, 4:46:35 AM
    Author     : mendezgonzalez.9
--%>
<%
    if(session.getAttribute("Email") != null)
        response.sendRedirect("index.jsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="Style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="cuerpo">
        <form class="formaslog"  action="ControladorUsers" method="POST">
            <label>Username</label> <input class="buscar" type="text" name="TxtLogUname"><br>
            <label>Password</label> <input class="buscar"  type="password" name="TxtLogPword">
             <button class ="imagenDerechaLog" type="submit">
                 <img style ="position: absolute; width: 8%; height: 17%; margin-top: -6%; margin-left: 5%;" src="Login.png"/>
            <input type="hidden" value="Login" name="action">
        </form>
       
            <form  method="GET" action="/Register.jsp">
                 <button class ="imagenRegistro" type="sumbit"  >
                 <img style ="position: absolute; width: 8%; height: 17%; margin-top: -10%; margin-left: 70%;" src="registro.png"/> 
            </form>

     </body>
</html>
