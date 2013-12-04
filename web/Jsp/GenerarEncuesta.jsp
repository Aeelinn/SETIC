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
</script>

<title>GenerarEncuesta</title>
<link href="<%=context%>/Css/estiloSetic.css" rel="stylesheet" type="text/css" />

<script src="<%=context%>/Js/jquery1.js"></script>
<script src="<%=context%>/Js/javaScript1.js"></script>
</head>

<body>
    <div class="cabecera">
        <img title="cabecera" src="<%=context%>/imagenes/cabecera.png"  />
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
</center>    
<div id="actualizarDatos">
    <p>Nombre de la encuesta</p>   
    <input type="text" name="nombre" value=""/>
    </br>
    <!--<p>Cantidad de preguntas</p></br>
      <input type="text" name="nomnre" value=""/></br> </br>-->		

    <p>Cantidad de respuestas</p>

    <form name="opciones" id="opcResp">
        <label>3</label><input type="radio" name="num" id="1" onClick=""/>	
        <div name="Respuestas3" id="resp3">
            <label>Bueno, Regular y Malo</label>
        </div>
        <label>5</label><input type="radio" name="num" id="2" onClick=""/>
        <div name="Respuestas5" id="resp5">
          <label>Muy bueno ,Bueno, Regular, Malo, y Muy Malo</label> 
        </div>
    </form>
</center>
</div>


<div id="actualizarDatos" ><center><p><p>
        <p>Escriba sus preguntas:</p>
        <form name="uno" id="uno">
            <div id="encuesta">
            </div>
        </form><div name="uno" id="contenedor"  >

            <input type="button" id="botonIndex" value="Guardar Encuesta"/>
        </div>
    </center></div>

</div>
</body>
</html>       
