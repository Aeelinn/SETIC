$().ready(function() {
    $("#form").submit(validar);
});

function validar() {
    var array = $();
    
    alert("Envio de formulario");
    event.preventDefault();
}