<%-- 
    Document   : GenerarEncuesta
    Created on : 3/12/2013, 04:57:56 PM
    Author     : Usuario
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <%--<link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css"/>--%>

    <script src="<%=context%>/Js/jquery.js"></script>
    <script src="<%=context%>/Js/generarEncuesta.js"></script>
</head>
<body>
    <title>Generar Encuesta</title>

    <%-- Codigo Servlet --%>
    <form action="<%=context%>/generarEncuesta" method="post" name="form">
        <p>Nombre de la encuesta</p>
        <input type="text" name="nombre" value="Prueba"/>
        <input type="date" name="cal">
        <p>Cantidad de respuestas</p>
        <label>3</label><input type="radio" name="num" value="3" checked/>
        <label>5</label><input type="radio" name="num" value="5"/>

        <p>Escriba sus preguntas:</p>
        <div id="encuesta">
            <%--Generacion de las preguntas.
                No escribir pendejadas aqui--%>
        </div>

        <input type="button" value="Guardar encuesta" onclick="form.submit()"/>
    </form>
    <%-- Codigo Servlet --%>

</body>
</html>
