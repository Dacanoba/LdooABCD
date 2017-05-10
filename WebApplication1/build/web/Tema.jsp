<%-- 
    Document   : index
    Created on : Apr 19, 2017, 11:26:35 PM
    Author     : Carlos Mendez
--%>
<%
    if(session.getAttribute("Email") == null)
        response.sendRedirect("Login.jsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tema</title>
        <link href="stilo.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

<div class="navbar">
  <a href="index.jsp">Home</a>
  <a href="Deportes.jsp">Deportes</a>
  <a href="#Tema">Tema</a>
  <a href="Tecnologias.jsp">Tecnologias</a>
  <h4><%= session.getAttribute("Email") %></h4>
</div><br><br><br>
       <form action="ComentariosControlador" method="get">
           <input type="submit" value="clickme">
        </form>
<div class="main">
  <h1>Tema Nuevo</h1>
  <h2>Aqui econtraras Tema nuevo!</h2>
  <h2>Algo va ir aqui!</h2>

</div>

</body>
</html>
