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
// Función de flecha para calcular el mayor texto del array
const calcularMayor = (valores) => {
    // Inicializar el valor mayor
    let mayor = "";

    // Recorrer el array para ver qué elemento del arrray, que sea una cadena de texto, tiene la mayor longitud
    for (let i = 0; i < valores.length; i++) {
        if (valores[i].length > mayor.length && typeof valores[i] === "string") {
            mayor = valores[i];
        }
    }

    // Devolver la variable mayor
    return mayor;
}

// Funcioón de flecha para realizar operaciones con datos booleanos
const operacionesBooleanas = (valores) => {
    let resultadoTrue = valores[0] || valores[2];
    let resultadoFalse = valores[0] && valores[2];

    document.write("<br><br>2)<br><br>&emsp;Resultado usando el operador OR: <b>"+resultadoTrue+"</b>");
    document.write("<br>&emsp;Resultado usando el operador AND: <b>"+resultadoFalse+"</b>");
}

// Función de flecha para realizar operaciones con valores enteros
const operacionesEnteros = (valores) => {
    // Pasar los valores a una variable de tipo entero
    let a = parseInt(valores[1]);
    let b = parseInt(valores[5]);

    // Realizar las 5 operaciones matemáticas
    document.write("<br><br>3)<br>");
    document.write("<br>&emsp;"+a+" + "+b+" = "+(a+b));
    document.write("<br>&emsp;"+a+" - "+b+" = "+(a-b));
    document.write("<br>&emsp;"+a+" x "+b+" = "+(a*b));
    document.write("<br>&emsp;"+a+" / "+b+" = "+(a/b));
    document.write("<br>&emsp;"+a+" % "+b+" = "+(a%b));
}

/*
##########################
    PROGRAMA PRINCIPAL
##########################
*/
// Inicializar el array dado
let valores = [true, 5, false, "hola", "adios", 2];

/**
 * APARTADO 1
 */

// Calcular el mayor texto del array
let mayor = calcularMayor(valores);

// Escribir por pantalla el resultado
document.write("1)<br><br>&emsp;El elemento de texto mayor es <b>"+mayor+"</b>");

/**
 * APARTADO 2
 */
operacionesBooleanas(valores);

/**
 * APARTADO 3
 */

operacionesEnteros(valores);

