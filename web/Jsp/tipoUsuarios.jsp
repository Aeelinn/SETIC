<%-- 
    Document   : tipoUsuarios
    Created on : 28/11/2013, 10:50:52 PM
    Author     : pako
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=context%>/Css/typoUsuario.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>
    <center><h1>Ingresar como:</h1></center>
    <div id="pincipal">
        <div id="contenedor">
            <a href="loginAdmin.jsp"><img alt="Administrador" src="<%=context%>/imagenes/1379305940_administrator.png" id="admin"></a>
            <p>Administrador</p>
        </div>
        <div id="conte">
            <a href="loginAlumno.jsp"><img alt="Alumno" src="<%=context%>/imagenes/graduated.png" id="alumn"></a>
            <p>Alumno</p>
        </div>
    </div>
    <a href="index.jsp"><img alt="flecha" src="<%=context%>/imagenes/flecha (1).png" id="flecha"></a>
</body>
</html>
