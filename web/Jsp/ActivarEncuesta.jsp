<%-- 
    Document   : ConsultarEncuesta
    Created on : 3/12/2013, 03:50:41 PM
    Author     : Carlos
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Activa Encuesta</title>
    </head>
    <body>
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
                    <td><a href="loginAdmin.jsp"><img src="<%=context%>/imagenes/SALIR.jpg" alt="" id="botonMenu"></a></td>
                </tr>
            </table>
        </div>
        <div id="actualizarDatos">
            <p>Ingresar nombre de la encuesta: </p>
            <input type="text" name="nombreEncuesta"/><input type="submit" id="botonIndex" value="Activar"/>
        </div>
                
            <div id="actualizarDatos">
                <label><strong> Encuestas Activas:  </strong></label> <label> 5 </label>
                <br/><br/>
                <p> Evaluación Docente <input type="checkbox" id="1"></p>         
                <p> Evaluación Docente TSU  <input type="checkbox" id="2"></p>
                <p> Evaluación Docente Ingenieria   <input type="checkbox" id="3"></p>
                <p> Evaluación Integradora <input type="checkbox" id="4"></p>
                <p> Evaluación Base De Datos   <input type="checkbox" id="5"></p>
            </div>
    </body>
</html>
