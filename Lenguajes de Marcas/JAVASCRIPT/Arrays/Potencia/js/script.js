/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variables
let base = 0;
let exponente = 0;
let resultado = 1;

// Pedir la base al usuario para calcular la potencia
do {
    base = parseInt(prompt("Introduzca la base:"));
    if (base <= 0 || isNaN(base)) {
        alert("Por favor, introduzca un número positivo");
    }
} while (base <= 0 || isNaN(base));

// Pedir el exponente al usuario para calcular la potencia
do {
    exponente = parseInt(prompt("Introduzca el exponente:"));
    if (exponente <= 0 || isNaN(exponente)) {
        alert("Por favor, introduzca un número positivo");
    }
} while (exponente <= 0 || isNaN(exponente));

// Inicializar la cadena que vamos a imprimir por pantalla
let cadena = base+"<sup>"+exponente+"</sup> = ";

// Realizar un for para multiplicar la base el número de veces que nos indica el exponente
for (let i = 0; i < exponente; i++) {
    cadena+=base+" x ";
    resultado*=base;
}

// Quitar el último x a la cadena que se muestra por pantalla
cadena = cadena.substring(0, cadena.length - 2);

// Añadir a la cadena el resultado
cadena+=" = "+resultado;

// Mostrar por pantalla la cadena del resultado
document.write(cadena);



