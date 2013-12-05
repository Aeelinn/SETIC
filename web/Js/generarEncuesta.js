$(function() {
    add();
});

function add() {
    $("#encuesta").append('<span><input name="pregunta" type="text" tabindex="1"> ' +
            '<input type="checkbox" name="chk" tabindex="3"/><br></span>');

    var array = $("[name='chk']");

    array.last().bind('change', del);

    if (array.length > 1)
        array[array.length - 2].checked = 1;

    array = $("[name='pregunta']");

    array[array.length - 1].focus();
    array.last().one('change', add);
}

function del() {
    if (event.currentTarget.checked)
        add();
    else {
        var array = $("[name='chk']");
        for (var i = 0; i < array.length - 1; i++) {
            if (!array[i].checked) {
                $("span")[i].remove();
                return;
            }
        }
    }
}

//function CrearElemento(n){
//	
//num=uno.nte.value;
//    for(i=1;i<=num;i++){
//var elemento=document.createElement('input');
//var salto=document.createElement('br');
//elemento.id='';
//elemento.name='text'+i;
//elemento.type='text';
//elemento.value=i+'.-';
//contenedor.appendChild(elemento);
//contenedor.appendChild(salto);}
//
//	}