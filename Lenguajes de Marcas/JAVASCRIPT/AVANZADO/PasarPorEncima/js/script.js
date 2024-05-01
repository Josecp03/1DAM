/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variables
let pasar = document.getElementById('Pasar');
let efecto = document.getElementById('Efectos')

// Añadir eventos
pasar.addEventListener("mouseover" , cambiarFondo);
pasar.addEventListener("mouseout", volverFondo);

// Función para cambiar el fondo
function  cambiarFondo() {
    efecto.style.backgroundColor = 'green';
    efecto.style.color = 'white';
}

// Función para dejar el mismo fondo que antes
function volverFondo() {
    efecto.style.backgroundColor = 'aliceblue';
    efecto.style.color = 'black';
}