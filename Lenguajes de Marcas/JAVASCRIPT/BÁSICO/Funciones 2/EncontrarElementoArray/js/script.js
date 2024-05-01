/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para pedir la posición original
const pedirNumero = (array) => {
    
    // Inicializar variables
    let n = 0;
    let encontrado = false;

    // Pedir el elemento
    do {

        // Pedir el elemento del array
        n = parseInt(prompt("Introduzca el elemento:"));
        
        // Comprobar que el elemento introducido está en el array
        for (let i = 0; i < array.length; i++) {
            if (n == array[i]) {
                encontrado = true;
            }            
        }
        
        // Mostrar un mensaje al usuario por si introduce un elemento que no está en el array
        if (!encontrado) {
            alert("Por favor, introduzca un elemento que se encuentre en el array");
        }

    } while (!encontrado);
    
    // Devolver el valor introducido por el usuario
    return n;
}

// Función para indicar la posición del elemento
findIndex = (array, numero) => {

    // Inicializar variables
    let posicion = 0;

    // Recorrer el array para calcular la posicion
    for (let i = 0; i < array.length; i++) {
        if (array[i] == numero) {
            posicion = i;
        }        
    }

    // Devolver la posición del elemento en el array
    return posicion;

}

// Inicializar el array
let array = [1,2,3,4,5,6,7,8,9];
let cadena = "<h2>["+array.toString()+"]</h2>";

// Indicar al usuario el elemento que tiene que introducir
alert("Del siguiente array: ["+array.toString()+"], indica el elemento del que quieres saber su posición")

// Pedir el número al usuario
let numero = pedirNumero(array);

// Calcular la posición en la que se encuentra el elemento
let posicion = findIndex(array, numero);

// Añadir valores a la cadena que se va a mostrar por pantalla
cadena += "El elemento "+numero+" se ha encontrado en la posición "+posicion+" del array";

// Imprimir por pantalla el resultado
document.write(cadena);
