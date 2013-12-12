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

    <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css"/>

    <script src="<%=context%>/Js/jquery.js"></script>
    <script src="<%=context%>/Js/generarEncuesta.js"></script>
</head>
<body>
    <title>Generar Encuesta</title>
<div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>

        <div class="menu">
            <table width="100%">
                <tr>
                    <td><a href="GenerarEncuesta.jsp"><img src="<%=context%>/imagenes/GENERAR.jpg" id="botonMenu"></a></td>
                    <td><a href="cambiarContraseña.jsp"><img src="<%=context%>/imagenes/ACTUALIZAR.jpg" id="botonMenu"></a></td>
                    <td><a href=".jsp"><img src="<%=context%>/imagenes/CONSULTAR.jpg" id="botonMenu"></a></td>
                    <td><a href="ActivarEncuesta.jsp"><img src="<%=context%>/imagenes/encuesta.jpg" alt="" id="botonMenu"></a></td>
                    <td><a href="index.jsp"><img src="<%=context%>/imagenes/SALIR.jpg" alt="" id="botonMenu"></a></td>
                </tr>
            </table>
        </div>
                
    <%-- Codigo Servlet --%>
    <form action="<%=context%>/generarEncuesta" method="post" name="form">
        <div id="actualizarDatos"> 
        <p>Nombre de la encuesta</p>
        <input type="text" name="nombre" value=""/>
        <p>Fechad de inicio</p><p><input type="date" name="fechaInicio" value="2013-10-10">
        <p>Fecha de termino</p><p> <input type="date" name="fechaFinal" value="2013-10-10"></p>
        <p>Cantidad de respuestas</p>
        <label>3</label><input type="radio" name="num" value="3" checked/>
        <label>5</label><input type="radio" name="num" value="5"/>

        <p>Escriba sus preguntas:</p>
        <div id="encuesta">
            <%--Generacion de las preguntas.
                No escribir pendejadas aqui--%>
        </div>

        <input type="button" id="botonIndex" value="Guardar encuesta" onclick="form.submit()"/>
        </div>
    </form>
    <%-- Codigo Servlet --%>

</body>
</html>
