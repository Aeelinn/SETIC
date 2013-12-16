<%-- 
    Document   : encuestaAlumnos
    Created on : 29/11/2013, 05:37:12 AM
    Author     : CARLOS
--%>
<%@page import="Bean.PreguntaBean"%>
<%@page import="java.util.List"%>
<%@page import="Bean.EncuestaBean"%>
<%
    String context = request.getContextPath();
    String matricula = (String) session.getAttribute("matricula");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--Codigo servlet--%>
        <%
            EncuestaBean encuesta = (EncuestaBean) session.getAttribute("encuesta");

            List<PreguntaBean> preguntas
                    = (List<PreguntaBean>) session.getAttribute("preguntas");
        %>
        Matricula: <%=matricula%>
        List: <%=preguntas.size()%>
        <%--Codigo servlet--%>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />
        <title>Encuesta Alumnos</title>
    </head>
    <body>
        <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>
    <center> <h1><%=encuesta.getNombre()%></h1> </center>
    <div id="ContestaEncuesta">
        <form action="<%=context%>/registrarResultado" name="formulario" method="post">

            <%for (int i = 0; i < preguntas.size(); i++) {
                    PreguntaBean bean = preguntas.get(i);%>

            <%if (encuesta.getTipoRespuestas() == 3) {%>
            <label><%=bean.getContenido()%></label><br/>
            <input type="radio" name="radio<%=i%>" value="malo" required/>Malo
            <input checked type="radio" name="radio<%=i%>" value="regular"/>Regular
            <input type="radio" name="radio<%=i%>" value="bueno"/>Bueno
            <%} else {%>
            <label><%=bean.getContenido()%></label><br/>
            <input type="radio" name="radio<%=i%>" value="muy malo"/>Muy malo
            <input type="radio" name="radio<%=i%>" value="malo"/>Malo
            <input checked type="radio" name="radio<%=i%>" value="regular"/>Regular
            <input type="radio" name="radio<%=i%>" value="bueno"/>Bueno
            <input type="radio" name="radio<%=i%>" value="muy bueno"/>Muy bueno
            <%}%>
            <br><br>
            <%}%>
            <input type="submit" Value="Finalizar Encuesta" id="botonEncuestaAlumno"/>
        </form>
    </div>
</body>
</html>
