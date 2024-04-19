/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para pedir los números al usuario
const pedirNumero = () => {
    // Inicializar variables
    let n = 0;

    // Pedir el número
    do {
        n = parseInt(prompt("Introduzca el número:"));
        if (isNaN(n)) {
            alert("Por favor, introduzca un número");
        }
    } while (isNaN(n));
    
    return n;
}

// Función para sumar dos números
const sumar = (a,b) => {
    return a + b;
}

// Función para restar dos números
const restar = (a,b) => {
    return a - b;
}

// Función para multiplicar dos números
const multiplicar = (a,b) => {
    return a * b;
}

// Función para dividir dos números
const dividir = (a,b) => {
    
    // Inicializar la variable
    let division = a / b

    // Si se divide entre 0, el resultado es infinito
    if (b == 0) {
        division = "∞";
    }
    
    // Devolver el valor de la operación
    return division;

}

// Inicializar variables
let a  = pedirNumero();
let b = pedirNumero();
let cadena = "";

// Calcular la suma de los dos números
let suma = sumar(a,b);

// Añadir valores a la cadena que vamos a imprimir por pantalla
cadena += "<h2>"+a+" + "+b+" = "+suma+"</h2>";

// Calcular la suma de los dos números
let resta = restar(a,b);

// Añadir valores a la cadena que vamos a imprimir por pantalla
cadena += "<h2>"+a+" - "+b+" = "+resta+"</h2>";

// Calcular la multiplicación de los dos números
let producto = multiplicar(a,b);

// Añadir valores a la cadena que vamos a imprimir por pantalla
cadena += "<h2>"+a+" x "+b+" = "+producto+"</h2>";

// Calcular la multiplicación de los dos números
let division = dividir(a,b);

// Añadir valores a la cadena que vamos a imprimir por pantalla
cadena += "<h2>"+a+" / "+b+" = "+division+"</h2>";

// Imprimir por pantalla los resultados
document.write(cadena);


