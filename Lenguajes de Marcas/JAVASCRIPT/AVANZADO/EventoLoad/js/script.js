/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para cuando haya cargado toda la página
window.addEventListener('load', function() {
    
    // Inicializat variables
    var caja = document.getElementById('caja');
    
    // Evento al pasar el ratón por encima
    caja.addEventListener('mouseover', cambiarRojo); 
    
    // Evento al pasar el ratón por fuera
    caja.addEventListener('mouseout', cambiarBlanco); 

});


// Funcion para cambiar la caja al color rojo
function cambiarRojo(){
    caja.style.backgroundColor = 'red';
}

// Función para cambiar la caja al color blanco
function cambiarBlanco(){
    caja.style.backgroundColor = 'white';
}

