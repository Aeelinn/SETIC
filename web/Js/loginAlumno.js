$(function() {
    $("form").bind("submit", validar);
    $("[name='matricula']").focus();
});

function validar() {
    var matricula = $("[name='matricula']").val() + "";
    matricula = matricula.toLowerCase();

    if (matricula === "") {
        alert("Escribe un numero de matricula");
        event.preventDefault();
    } else {
        if (!matricula.match(/^20[0-9]{2}[1-3]ti[0-9]{3}$/)) {
            alert("Matricula no valida");
            event.preventDefault();
        }
    }
}