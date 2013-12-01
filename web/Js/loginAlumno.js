$(function() {
    $("form").bind("submit", validar);
    $("[name='matricula']").focus();
});

function validar() {
    var matricula = $("[name='matricula']").val();

    if (matricula === "") {
        alert("Escribe un numero de matricula");
        event.preventDefault();
    } else {
        if (!matricula.match(/^[0-9]{4}[1-3][A-Za-z]{2}[0-9]{3}$/)) {
            alert("Matricula no valida");
            event.preventDefault();
        }
    }
}