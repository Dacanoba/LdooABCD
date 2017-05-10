<%-- 
    Document   : index
    Created on : Apr 19, 2017, 11:26:35 PM
    Author     : mendezgonzalez.9
--%>




<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Utilitis.ComentariosPOJO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tecnologias</title>
        <link href="stilo.css" rel="stylesheet" type="text/css"/>
 <%
     
       List comentarios = (List) session.getAttribute("comentar");
    if(session.getAttribute("Email") == null){
        session.setAttribute("Email", "Invitado");
 }%>
    </head>
    <body>

<div class="navbar">
  <a href="index.jsp">Home</a>
  <a href="Deportes.jsp">Deportes</a>
  <a href="Tema.jsp">Tema</a>
  <a href="#Tecnologias">Tecnologias</a>
  <h4><%= session.getAttribute("Email") %></h4>
</div><br><br><br>

       <form action="ComentariosControlador" method="get">
           <input type="submit" value="clickme">
        </form>
        
<%  for (Object obj : comentarios){
            ComentariosPOJO comentario = (ComentariosPOJO) obj;
        %>        
<div class="main">
  <h1><%=comentario.getImagen() %></h1>
  <h2><%=comentario.getTitulo() %> </h2>
  
</div>

<% } //cierre de for %>




</body>
</html>
