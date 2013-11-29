<%-- 
    Document   : encuestaAlumnos
    Created on : 29/11/2013, 05:37:12 AM
    Author     : CARLOS
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta Alumnos</title>
    </head>
    <body>

        <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>


        <div id="nombreEncuesta"> <h1>Encuesta</h1> </div>



        <div id="ContestaEncuesta">
            <form name="formulario" onSubmit="gracias">
                <label> PREGUNTA NUMERO 1 ? </label><br/>
                <input type="radio" name="pregunta1"/> BUENO
                <input type="radio" name="pregunta1"/> REGULAR
                <input type="radio" name="pregunta1"/>MALO
                <br/><br/>
                <label> PREGUNTA NUMERO 2 ? </label><br/>
                <input type="radio" name="pregunta2"/> BUENO
                <input type="radio" name="pregunta2"/> REGULAR
                <input type="radio" name="pregunta2"/>MALO
                <br/><br/>
                <label> PREGUNTA NUMERO 3 ? </label><br/>
                <input type="radio" name="pregunta3"/> BUENO
                <input type="radio" name="pregunta3"/>REGULAR
                <input type="radio" name="pregunta3"/>MALO
                <br/><br/>
                <label> PREGUNTA NUMERO 4 ? </label><br/>
                <input type="radio" name="pregunta4"/> BUENO
                <input type="radio" name="pregunta4"/> REGULAR
                <input type="radio" name="pregunta4"/>MALO
                <br/><br/>
                <label> PREGUNTA NUMERO 5 ? </label><br/>
                <input type="radio" name="pregunta5"/> BUENO
                <input type="radio" name="pregunta5"/> REGULAR
                <input type="radio" name="pregunta5"/>MALO
                <br/><br/><br/>  

            </form>
        </div>
    <td><input type="button" Value="Guardar Encuesta" id="botonEncuestaAlumno"/></td>
    <input type="button" Value="Finalizar Encuesta" id="botonEncuestaAlumno"/>


</body>
</html>
