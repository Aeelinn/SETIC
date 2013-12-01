<%-- 
    Document   : loginAdmin
    Created on : 29/11/2013, 12:52:55 AM
    Author     : CARLOS
--%>
<% String context = request.getContextPath();%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="<%=context%>/Css/administrador.css" rel="stylesheet" type="text/css" />

        <script src="<%=context%>/Js/jquery.js" type="text/javascript"></script>
        <script src="<%=context%>/Js/loginAdmin.js" type="text/javascript"></script>

        <title>Login Administrador</title>
    </head>
    <body>
        <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>
        <div id="ConteLoginAlumno">
            <div class="logindiv">
                <form action="" id="form" method="post">
                    <table>
                        <tr>
                            <td rowspan="3">
                                <img src="<%=context%>/imagenes/admin.png"/></td>
                            <td> Usuario:</td>
                            <td><input name="user" type="text" required/></td>
                        </tr>
                        <tr>
                            <td> Password:</td>
                            <td><input name="pass" type="password" required/></td>
                        </tr>
                        <tr>
                            <td>&nbsp; </td>
                            <td><input type="submit" value="Ingresar"/></td>
                        </tr>			
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
