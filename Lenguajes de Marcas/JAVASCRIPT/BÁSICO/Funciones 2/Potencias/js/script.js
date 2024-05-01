/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para pedir la longitud del array
const pedirNumero = () => {
    // Inicializar variables
    let n = 0;

    // Pedir la longitud del array al usuario 
    do {
        n = parseInt(prompt("Introduzca el número:"));
        if (n < 0 || isNaN(n)) {
            alert("Por favor, introduzca un número positivo");
        }
    } while (n < 0 || isNaN(n));
    
    return n;
}

// Función para calcular el cuadrado del número introducido
const calcularPotencia = (base, exponente) => {
    
    // Inicializar la variable resultado
    let resultado = 1;

    // Realizar un for para multiplicar la base el número de veces que nos indica el exponente
    for (let i = 0; i < exponente; i++) {
        resultado*=base;
    }

    // Devolver el resultado
    return resultado;
}

// Inicializar variables
let numero = pedirNumero();
let cadena = "";

// Calcular el cuadrado del número introducido por el usuario
let cuadrado = calcularPotencia(numero, 2);

// Añadir valores a la cadena que se va a mostrar por pantalla
cadena += numero+"<sup>2</sup> = "+cuadrado+"<br>";

// Calcular el cubo del número introducido por el usuario
let cubo = calcularPotencia(numero, 3);

// Añadir valores a la cadena que se va a mostrar por pantalla
cadena += numero+"<sup>3</sup> = "+cubo+"<br>";

// Imprimir por pantalla la cadena
document.write(cadena);