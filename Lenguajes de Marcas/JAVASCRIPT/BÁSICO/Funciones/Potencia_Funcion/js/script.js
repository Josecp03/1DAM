/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

/*
###########################    
    FUNCIONES DE FLECHA
###########################
*/
const pedirBase = () => {

    // Inicializar la variable base
    let base = 0;

    // Pedir la base al usuario para calcular la potencia
    do {
        base = parseInt(prompt("Introduzca la base:"));
        if (base <= 0 || isNaN(base)) {
            alert("Por favor, introduzca un número positivo");
        }
    } while (base <= 0 || isNaN(base));

    // Devolver la base de la potencia que queremos calcular
    return base;
}

const pedirExponente = () => {

    // Inicializar la variable exponente
    let exponente = 0;

    // Pedir el exponente al usuario para calcular la potencia
    do {
        exponente = parseInt(prompt("Introduzca el exponente:"));
        if (exponente < 0 || isNaN(exponente)) {
            alert("Por favor, introduzca un número positivo");
        }
    } while (exponente < 0 || isNaN(exponente));

    // Devolver el exponente de la potencia que queremos calcular
    return exponente;
}

const calcularPotencia = (base, exponente) => {
    
    // Inicializar la variable resultado
    let resultado = 1;

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

    // Devolver la cadena
    return cadena;
}

/*
##########################
    PROGRAMA PRINCIPAL
##########################
*/
// Inicializar variables
let base = pedirBase();
let exponente = pedirExponente();

// Calcular lo que vamos a imprimir por pantalla
let cadena = calcularPotencia(base, exponente);

// Mostrar por pantalla la cadena del resultado
document.write(cadena);



