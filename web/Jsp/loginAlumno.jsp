<%-- 
    Document   : loginAlumno
    Created on : 29/11/2013, 01:37:55 AM
    Author     : CARLOS
--%>
<%
    String context = request.getContextPath();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />

        <script src="<%=context%>/Js/jquery.js" type="text/javascript"></script>
        <script src="<%=context%>/Js/loginAlumno.js" type="text/javascript"></script>

        <title>LoginAlumno</title>
    </head>
    <body>
        <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>
        <div id="ConteLoginAlumno"> 
            <div class="logindiv">
                <form action="<%=context%>/encuestaAlumno" id="form" method="post">
                    <table id="alumnoTable" border="0">
                        <tr>
                            <td rowspan="2">
                                <img src="<%=context%>/imagenes/alumno.png" title="alumno"/></td>
                            <td> Matricula:</td>
                            <td> <input name="matricula" type="text" required/></td>
                        </tr>
                        <%--<tr>
                            <td> Contraseña:</td>
                            <td> <input name="password" type="password" name="" value=""/></td>
                        </tr>--%>
                        <tr>
                            <td>&nbsp; </td>
                            <td> <input type="submit"  id="botonIndex" value="Ingresar"/></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
