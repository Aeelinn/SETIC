$(function() {
    $("form").bind("submit", validar);
});

function validar() {
    var user = $("[name='user']").val() + "";
    var pass = $("[name='pass']").val() + "";
    
    if (user === "" || pass === "") {
        alert("Debe llenar todos los campos");
        event.preventDefault();
    }
}