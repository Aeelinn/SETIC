$().ready(function() {
    //alert("jQuery: Document ready");
    $("form").bind("submit", validar);
});

function validar() {
    var pass = $("[name='actual']").val() + "";
    var newPass = $("[name='nuevo']").val() + "";
    var confirm = $("[name='confirmacion']").val() + "";

    if (pass === "" || newPass === "" || confirm === "") {
        alert("Debe llenar todos los campos.");
        event.preventDefault();
    } else {
        if (newPass !== confirm) {
            alert("La nueva contraseña no coindide");
            event.preventDefault();
        }
    }
}