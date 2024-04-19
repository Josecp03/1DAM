/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para pedir la posición original
const pedirPosicion = (array) => {
    
    // Inicializar variables
    let n = 0;

    // Pedir la longitud del array al usuario 
    do {
        n = parseInt(prompt("Introduzca la posición:"));
        if (n < 0 || isNaN(n) || n > array.length-1) {
            alert("Por favor, introduzca un número dentro del rango");
        }
    } while (n < 0 || isNaN(n) || n > array.length-1);
    
    return n;
}

// Función para cambiar posiciones del array
const cambiarPosicion = (array, original, final) => {

    // Inicializar un nuevo array
    let nuevoArray = new Array(array.length);

    // Cambiar las posiciones
    nuevoArray[original] = array [final];
    nuevoArray[final] = array [original];

    // Rellenar las posiciones que no se han cambiado
    for (let i = 0; i < array.length; i++) {
        if (i != original && i != final) {
            nuevoArray[i] = array [i];
        }      
    }

    // Devolver el nuevo array
    return nuevoArray;
    
}

// Inicializar variables
let array = [1,2,3];
let cadena = "<h2>ARRAY ORIGINAL</h2>["+array.toString()+"]";

// Imprimir por pantalla el 

// Función para pedir la posicion original
alert("Introduzca la posición original del elemento que quiere cambiar")
let posOriginal = pedirPosicion(array);

// Función para pedir la posición final
alert("Ahora, introduzca la posición a la que quiere cambiar el elemento")
let posFinal = pedirPosicion(array);

// Función para cambiar las posiciones del array
array = cambiarPosicion(array, posOriginal, posFinal);

// Añadir a la variable cadena el resultado
cadena += "<h2>NUEVO ARRRAY CAMBIANDO LAS POSICONES "+posOriginal+" POR LA "+posFinal+"</h2>["+array.toString()+"]";

// Imprimir por pantalla el resultado
document.write(cadena);