/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/


// Inicializar variable
let miDiv = document.getElementById('miDiv');

// Añadir evento al hacer click
miDiv.addEventListener("click" , mostrarAlerta);

// Función para mostrar la alerta
function  mostrarAlerta() {
    alert("Pulsaste el botón");
}
