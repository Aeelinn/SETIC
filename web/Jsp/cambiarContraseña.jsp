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

        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />

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
                    <td><a href="<%=context%>/GenerarEncuestas.html"><img src="<%=context%>/imagenes/GENERAR.jpg" id="botonMenu"></a></td>
                    <td><a href="<%=context%>/Actualizar datos.html"><img src="<%=context%>/imagenes/ACTUALIZAR.jpg" id="botonMenu"></a></td>
                    <td><a href="<%=context%>/Mostrar resultados.html"><img src="<%=context%>/imagenes/CONSULTAR.jpg" id="botonMenu"></a></td>
                    <td><a href="<%=context%>/Login Admin.html"><img src="<%=context%>/imagenes/SALIR.jpg" alt="" id="botonMenu"></a></td>
                </tr>
            </table>
        </div>

        <form action="" id="form" method="post">
            <div id="actualizarDatos">    
                <label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contraseña Actual :</label> 
                <input type="text" name="actual"/></br><br/>
                <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nueva Contraseña: </label> 
                <input type="text" name="nuevo"/></br><br/>
                <label>Confirmar Contraseña: </label> 
                <input type="text" name="confirmacion"/></br><br/>
                <input type="submit" value="Guardar Cambios"/>
            </div>
        </form>
    </body>
</html>
