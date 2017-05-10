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
        <title>Home</title>
        <link href="stilo.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

<div class="navbar">
  <a href="#index">Home</a>
  <a href="Deportes.jsp">Deportes</a>
  <a href="Tema.jsp">Tema</a>
  <a href="Tecnologias.jsp">Tecnologias</a>
  <h4><%= session.getAttribute("Email") %></h4>
</div><br><br><br>

<div class="main">
    <h1>Noticias Novedosas</h1>
  <h2>Aqui econtraras las ultimas Noticias!</h2>
  <h2>Algo va ir aqui!</h2>

</div>

</body>
</html>
