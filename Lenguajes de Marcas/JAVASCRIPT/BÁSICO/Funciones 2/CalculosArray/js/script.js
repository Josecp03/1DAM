/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para generar un array con 20 números aleatorios
const arrayAleatorio = (array) => {

    // Iterar el array con un for
    for (let i = 0; i < array.length; i++) {
        // Generar número aleatorio entre 1 y 100  añadirlo al array
        array[i] = Math.floor(Math.random() * 100) + 1
    }

    // Devolver el array
    return array;
}

// Función para sumar los números del array
const sumarNumerosArray = (array) => {

    // Inicializar la variable suma
    let suma = 0;

    // Recorrer todo el aray para sumar los números
    for (let i = 0; i < array.length; i++) {
        suma += array[i];       
    }

    // Devolver la suma
    return suma;

}

// Función para calcular el promedio de los elementos del array
const promedioArray = (array) => {

    // Inicializar variables 
    let suma = sumarNumerosArray(array);
    let cont = array.length;

    // Devolver la media
    return suma/cont;
}

// Función para calcular el máximo número del array
const maximoArray = (array) => {

    // Inicializar variables
    maximo = 0;

    // Recorrer el array para calcular el máximo
    for (let i = 0; i < array.length; i++) {
        if (array[i] > maximo) {
            maximo = array[i];
        }               
    }

    // Devolver el elemento máximo del array
    return maximo;
}

// Función para calcular el máximo número del array
const minimoArray = (array) => {

    // Inicializar variables
    minimo = 100;

    // Recorrer el array para calcular el máximo
    for (let i = 0; i < array.length; i++) {
        if (array[i] < minimo) {
            minimo = array[i];
        }               
    }

    // Devolver el elemento máximo del array
    return minimo;
}

// Inicializar un array de 20 posiciones con números aleatorios
let array = new Array(20);
array = arrayAleatorio(array);


// Inicializar la variable cadena que se va a mostrar por pantalla
let cadena = "<h2>ARRAY ORIGINAL</h2>["+array.toString()+"]";

// Sumar todos los números del array
let suma = sumarNumerosArray(array);

// Añadir a la variable cadena la suma
cadena += "<h2>SUMA DE LOS NÚMEROS DEL ARRAY</h2>suma = "+suma;

// Calcular el promedio de los elementos del array
let promedio = promedioArray(array);

// Añadir a la variable cadena el promedio
cadena += "<h2>PROMEDIO DE LOS NÚMEROS DEL ARRAY</h2>pomedio = "+promedio;

// Calcular el número máximo del array
let max = maximoArray(array);

// Añadir a la variable cadena el máximo
cadena += "<h2>MÁXIMO ELEMENTO DEL ARRAY</h2>máximo = "+max;

// Calcular el mínimo del array
let min = minimoArray(array);

// Añadir a la variable cadena el mínimo
cadena += "<h2>MÍNIMO ELEMENTO DEL ARRAY</h2>mínimo = "+min;

// Imprimir por pantalla la cadena con los resultados
document.write(cadena);
