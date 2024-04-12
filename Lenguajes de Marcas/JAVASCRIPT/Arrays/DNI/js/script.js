/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variables
let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];
numero = 0;

// Leer el dni introducido por el usuario
dni = prompt("Introduzca su DNI:");

// Crear una variable solo con el número y otra solo con la letra utilizando un substring
numero = parseInt(dni.substring(0, dni.length - 1));
l = dni.substring(dni.length-1, dni.length).toUpperCase();

// Comprobar si el número es menor que 0 o mayor que 99999999. 
if (!isNaN(dni) || numero < 0 || numero > 99999999) {
    alert("El número proporcionado no es válido.");    
} else {
    
    // Calcular la letra del dni
    letraCalculada = letras[numero % 23];

    // Comprobar que la letra introducida es igual a la calculada
    if (l === letraCalculada) {
        alert("El número y la letra del dni son correctos");
    } else {
        alert("La letra que ha indicado no es correcta");
    }
}

/**
 * APARTADO E
 * 
 * Si no realizamos la conversión de datos del valor String que devuelve prompt(), el valor ingresado por el usuario se tratará como 
 * una cadena de texto en lugar de un número. Esto significa que no podríamos realizar operaciones numéricas directamente con ese valor, 
 * como en el caso de calcular el número del DNI o verificar si está dentro de un rango específico.
 */

/**
 * APARTADO F
 * 
 * El ejercicio sería exactamente igual pero cambiando la instrucción alert() por console.log()
 */

/* El apartado F sería tal que así:
// Inicializar variables
let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];
numero = 0;

dni = prompt("Introduzca su DNI:");

// Crear una variable solo con el número y otra solo con la letra utilizando un substring
numero = parseInt(dni.substring(0, dni.length - 1));
l = dni.substring(dni.length-1, dni.length).toUpperCase();

// Comprobar si el número es menor que 0 o mayor que 99999999. 
if (!isNaN(dni) || numero < 0 || numero > 99999999) {
    console.log("El número proporcionado no es válido.");    
} else {
    // Calcular la letra del dni
    letraCalculada = letras[numero % 23];

    // Comprobar que la letra introducida es igual a la calculada
    if (l === letraCalculada) {
        console.log("El número y la letra del dni son correctos");
    } else {
        console.log("La letra que ha indicado no es correcta");
    }
}
*/


/**
 * APARTADO G
 * 
 * Lo único que habría que cambiar para que la salida se realice directamente sobre el documento HTML es cambiar la instrucción
 * alert() por document.write()
 */
