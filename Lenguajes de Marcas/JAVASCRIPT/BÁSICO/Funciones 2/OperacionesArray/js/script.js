/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función de iterar con WHILE
const arrayWhile = (array) => {
    
    // Inicializar el contador a 0
    let i = 0;

    // Inicializar la cadena que se va a mostrar por pantalla
    let cadena = "array = [";
    
    // Bucle para iterar el array
    while (i < array.length) {
        cadena += array[i]+",";
        i++;
    }

    // Eliminar la última coma
    cadena = cadena.substring(0,cadena.length-1);
    
    // Completar la cadena que se muestra por pantalla
    cadena += "]"

    // Mostrar por pantalla los elementos del array
    document.write("<h2>ITERAR CON WHILE</h2>"+cadena);
}

// Función de iterar  con FOR
const arrayFor = (array) => {

    // Inicializar la cadena que se va a mostrar por pantalla
    let cadena = "array = ["
    
    // Bucle for para iterar el array
    for (let i = 0; i < array.length; i++) {
        cadena += array[i]+",";
    }

    // Eliminar la última coma
    cadena = cadena.substring(0,cadena.length-1);
    
    // Completar la cadena que se muestra por pantalla
    cadena += "]"

    // Mostrar por pantalla los elementos del array
    document.write("<h2>ITERAR CON FOR</h2>"+cadena);

}

// Función de iterar  con FOREACH
const arrayForEach = (array) => {
    
    // Inicializar la cadena que se va a mostrar por pantalla
    let cadena = "array = ["
    
    // Bucle forEach para iterar el array
    array.forEach(element => {
        cadena += element+",";
    });

    // Eliminar la última coma
    cadena = cadena.substring(0,cadena.length-1);
    
    // Completar la cadena que se muestra por pantalla
    cadena += "]"

    // Mostrar por pantalla los elementos del array
    document.write("<h2>ITERAR CON FOR</h2>"+cadena);

}

// Función para mostrar los elementos sumados
const mostrarSumados = (array) => {

    // Inicializar la cadena que se va a mostrar por pantalla
    let cadena = "array = ["
    
    // Bucle for para iterar el array
    for (let i = 0; i < array.length; i++) {
        cadena += (array[i]+1)+",";
    }

    // Eliminar la última coma
    cadena = cadena.substring(0,cadena.length-1);
    
    // Completar la cadena que se muestra por pantalla
    cadena += "]"

    // Mostrar por pantalla los elementos del array
    document.write("<h2>MOSTRAR NÚMEROS SUMADOS</h2>"+cadena);

}

// Función para generar un nuevo array pero con los números sumados
const copiaArraySumados = (array) => {

    // Inicializar el nuevo array
    let nuevoArray = [];

    // Iterar el array antiguo, añadiendo al nuevo array el elemento sumándole uno
    for (let i = 0; i < array.length; i++) {
        nuevoArray[i] = array[i] + 1;
    }

    // Imprimir por pantalla el resultado
    document.write("<h2>NUEVO ARRAY CON NÚMEROS SUMADOS</h2>nuevo array = ["+nuevoArray.toString()+"]");

}

// Función para generar un array con 20 números aleatorios
const arrayAleatorio = (array) => {

    // Iterar el array con un for
    for (let i = 0; i < array.length; i++) {
        // Generar número aleatorio entre 1 y 100  añadirlo al array
        array[i] = Math.floor(Math.random() * 100) + 1
    }

    // Imprimir por pantalla los resultados
    document.write("<h2>ARRAY ALEATORIO</h2>array aleatorio = ["+array.toString()+"]");
}

// Función para pedir la longitud del array
const pedirlongitud = () => {
    // Inicializar variables
    let n = 0;

    // Pedir la longitud del array al usuario 
    do {
        n = parseInt(prompt("Introduzca una longitud para el array:"));
        if (n <= 0 || isNaN(n)) {
            alert("Por favor, introduzca un número positivo");
        }
    } while (n <= 0 || isNaN(n));
    
    return n;
}

// Función para pedir un color
const pedirColor = () => {
    
    // Inicialar la variable color
    let color = "";

    // Pedir el color al usuario
    color = prompt("Introduzca el color:");
    
    // Devolver el color introducido por el usuario
    return color;

}

// Función para comprobar si el color introducido por el usuario se encuentra en el array 
const colorEncontrado = (array, color) => {
    
    // Inicializar la variable booleana 
    let encontrado = false;
    
    // Recorrer el array para comprobar si el color introducido está en el array
    for (let i = 0; i < array.length; i++) {
        if (array[i]===color) {
            encontrado = true;
        }
    }

    // Inicializar lo que se va a mostrar por pantalla
    let cadena = "<h2>ARRAY DE COLORES</h2>";

    // Imprimir por pantalla si se ha encontrado el color en el array
    if (encontrado) {
        cadena+="El color "+color+" sí se encuentra en el siguiente array: ["+array.toString()+"]";
    } else {
        cadena+="El color "+color+" no se encuentra en el siguiente array: ["+array.toString()+"]";
    }

    // Imprimir por pantalla la cadena
    document.write(cadena);
}

// Inicializar el array
let array = [1,2,3,4,5,6];

// Iterar con while
arrayWhile(array);

// Iterar con for
arrayFor(array);

// Iterar con forEach
arrayForEach(array);

// Mostrar por pantalla los números del array sumándole uno a cada uno
mostrarSumados(array);

// Generar un nuevo array pero con los números sumados
copiaArraySumados(array);

// Generar un array de 20 números aleatorios
let arrayVacio = new Array(20);
arrayAleatorio(arrayVacio);

// Generar un array aleatorio con la longitud introducida por el usuario
longitud = pedirlongitud();
let arrayNuevo = new Array(longitud);
arrayAleatorio(arrayNuevo);

// Determinar si el color introducido por el usuario se encuentra en el array o no
let arrayColores = ["azul", "amarillo", "rojo", "verde", "café", "rosa"];

let color = pedirColor();
colorEncontrado(arrayColores, color);






