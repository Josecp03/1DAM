/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para pedir el número al usuario
const pedirNumero = () => {
    
    // Inicializar variables
    let n = 0;

    // Pedir el número
    do {
        n = parseInt(prompt("Introduzca el número:"));
        if (isNaN(n) || n <= 0) {
            alert("Por favor, introduzca un número");
        }
    } while (isNaN(n) || n<= 0);
    
    return n;
}

// Función para calcular array descendiente
const arrayDescendiente = (n) => {

    // Inicializar array
    let array = new Array(n);

    // Completar el array
    for (let i = 0; i < array.length; i++) {
        array[i] = n;
        n--;
    }

    // Devolver el array
    return array;
}

// Inicializar variables
let n = pedirNumero();

// Calcular el array decreciente
let array = arrayDescendiente(n);

// Añadir a la cadena que se va a mostrar por pantalla el array decreciente
let cadena = "<h2>ARRAY DECRECIENTE</h2>["+array.toString()+"]";

// Imprimir por pantalla el resultado
document.write(cadena);

