/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

let pantalla = document.getElementById('pantalla');
let eliminar = document.getElementById('eliminador');
let divisor = document.getElementById('divisor');
let multiplicador = document.getElementById('multiplicador');
let restador = document.getElementById('restador');
let sumador = document.getElementById('sumador');
let igualador = document.getElementById('igualador');
let cero = document.getElementById('cero');
let uno = document.getElementById('uno');
let dos = document.getElementById('dos');
let tres = document.getElementById('tres');
let cuatro = document.getElementById('cuatro');
let cinco = document.getElementById('cinco');
let seis = document.getElementById('seis');
let siete = document.getElementById('siete');
let ocho = document.getElementById('ocho');
let nueve = document.getElementById('nueve');
let punto = document.getElementById('punto');
let cadena = "";


eliminar.onclick = function() {
    cadena = "";
    pantalla.value = cadena;
}

divisor.onclick = function() {
    cadena += "/";
    pantalla.value = cadena;
}

multiplicador.onclick = function() {
    cadena += "x";
    pantalla.value = cadena;
}

restador.onclick = function() {
    cadena += "-";
    pantalla.value = cadena;
}

sumador.onclick = function() {
    cadena += "+";
    pantalla.value = cadena;
}

siete.onclick = function() {
    cadena += "7";
    pantalla.value = cadena;
}

ocho.onclick = function() {
    cadena += "8";
    pantalla.value = cadena;
}

nueve.onclick = function() {
    cadena += "9";
    pantalla.value = cadena;
}

cuatro.onclick = function() {
    cadena += "4";
    pantalla.value = cadena;
}

cinco.onclick = function() {
    cadena += "5";
    pantalla.value = cadena;
}

seis.onclick = function() {
    cadena += "6";
    pantalla.value = cadena;
}

uno.onclick = function() {
    cadena += "1";
    pantalla.value = cadena;
}

dos.onclick = function() {
    cadena += "2";
    pantalla.value = cadena;
}

tres.onclick = function() {
    cadena += "3";
    pantalla.value = cadena;
}

cero.onclick = function() {
    cadena += "0";
    pantalla.value = cadena;
}

punto.onclick = function () {
    cadena += ".";
    pantalla.value = cadena;
}

igualador.onclick = function() {
    cadena = cadena.replace("x","*");
    let resultado = eval(cadena);
    pantalla.value = resultado;
    cadena = resultado
}






