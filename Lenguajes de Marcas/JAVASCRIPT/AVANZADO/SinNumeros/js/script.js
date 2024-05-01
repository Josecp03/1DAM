/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variable
let texto = document.getElementById('letras');

// Manejador de evento para el evento 'input'
texto.addEventListener('input', solonumeros); 
   
// Función para evitar los números
function solonumeros(evento) {
    
    let valor = evento.target.value;
    let nuevoValor = '';
    
    // Iterar sobre cada carácter del valor
    for (var i = 0; i < valor.length; i++) {

        // Inicializar el caracter
        let caracter = valor[i];

        // Verificar si el carácter no es un número
        if (isNaN(parseInt(caracter))) {

            // Si no es un número, agregarlo al nuevo valor
            nuevoValor += caracter;
        }
    }

    // Actualizar el valor del campo de entrada con el nuevo valor
    evento.target.value = nuevoValor;

}
    


