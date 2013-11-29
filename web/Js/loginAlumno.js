$(function() {
    $("[name='matricula']").focus();
});

function validar() {
    var matricula = $("[name='matricula']").val();

    if (matricula.match(/^[0-9]{4}[1-3][A-Za-z]{2}[0-9]{3}$/)) {
        alert("Matricula valida");
    } else {
        alert("Matricula invalida");
        event.preventDefault();
    }
}