<%-- 
    Document   : index
    Created on : 28/11/2013, 10:49:55 PM
    Author     : CARLOS
--%>
<% String context = request.getContextPath();%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <div class="cabecera">
            <img title="cabecera" src="<%=context%>/imagenes/cabecera.png" />
        </div>

        <h1> Bienvenidos </h1>
        <div class="index">
            <p> 
                Has ingresado al Sistema Generador de Encuestas Electrónicas de la Universidad Tecnologica de Emiliano Zapata(UTEZ).
            </p>
            <p>
                Éste un canal de comunicación construido con el objetivo de conocerte, queremos saber tu opinión y la percepción que tienes acerca de diversos temas, a través de las encuestas que aquí encontrarás. 
                Al participar, con tus respuestas, contribuirás a que detectemos tus necesidades y la apreciación de nuestro servicio educativo y por supuesto nos comprometemos a hacer de los resultados obtenidos, una herramienta para la mejora continua.     
            </p>    
        </div>
        <input type="button" value="Entrar" id="botonIndex"/>


    </body>

</html>
