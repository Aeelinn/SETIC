<%-- 
    Document   : actualizarDatos
    Created on : 29/11/2013, 02:42:33 AM
    Author     : CARLOS
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css"/>
        <script src="<%=context%>/Js/jquery.js" type="text/javascript"></script>
        <script src="<%=context%>/Js/cambiarContraseña.js" type="text/javascript"></script>

        <title>Cambiar Contraseña</title>
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
                    <td><a href="index.jsp"><img src="<%=context%>/imagenes/SALIR.jpg" alt="" id="botonMenu"></a></td>
                </tr>
            </table>
        </div>

        <form action="<%=context%>/cambiarContraseña" id="form" method="post">
            <div id="actualizarDatos">    
                <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contraseña Actual :</label> 
                <input type="password" name="pass"/></br><br/>
                <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nueva Contraseña: </label> 
                <input type="password" name="passNuevo"/></br><br/>
                <label>Confirmar Contraseña: </label> 
                <input type="password" name="passConfirmacion"/></br><br/>
                <input type="submit"  id="botonIndex" value="Guardar Cambios"/>
            </div>
        </form>
    </body>
</html>
