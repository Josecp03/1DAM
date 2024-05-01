/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variables
let precio = document.getElementById('precio');
let cantidad = document.getElementById('cantidad');
let enviar = document.getElementById('enviar');
let total = document.getElementById('total');

// Crear evento cuando haga click en el botón
enviar.addEventListener("click" , calcular);

// Función para calcular el total
function calcular() {
    total.value = precio.value*cantidad.value;
}


