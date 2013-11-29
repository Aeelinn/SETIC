<%-- 
    Document   : loginAdmin
    Created on : 29/11/2013, 12:52:55 AM
    Author     : CARLOS
--%>
<% String context= request.getContextPath();%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="<%=context%>/Css/administrador.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Administrador</title>
    </head>
    <body>
        <div class="cabecera">
        <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
    </div>

    
    <div id="ConteLoginAlumno">
            <div class="logindiv">
            <form method=" " name="formAlumno" action="">
            <table>
    <tr>
    <td rowspan="3">
        <img src="<%=context%>/imagenes/admin.png"/></td>
    <td> Usuario:</td>
    <td> <input name="usuario" type="text" value=" "/ ></td>
    </tr>
    
    
    <tr>
    <td> Password:</td>
    <td> <input name="pass" type="password" name="" value=""/></td>
    </tr>
    
    <tr>
    <td>&nbsp; </td>
    <td> <input type="button" name="" value="Ingresar" id="ingresarBoton" onClick="validarAlumno()"/></td>
    </form>
    
    </tr>			
                </table>
    
            </div>
        </div>
</body>

</html>
