/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variables
let año = 0;
let mes = 0;
let dia = 0;
let diacorrecto = 0;
let meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Diciembre"];

// Pedir el año al usuario
do {
    año = parseInt(prompt("Introduzca el año:"));
    if (año < 0 || isNaN(año)) {
        alert("Por favor, introduzca un año real");
    }
} while (año <= 0 || isNaN(año));

// Pedir el mes al usuario 
do {
    mes = parseInt(prompt("Introduzca el mes:"));
    if (mes <= 0 || mes > 12 || isNaN(mes)) {
        alert("Por favor, introduzca un mes realista");
    }
} while (mes <= 0 || mes > 12 || isNaN(mes));

// Calcular el día correcto para el mes introducido
if (mes === 1 || mes === 3 || mes === 5 || mes === 7 || mes === 8 || mes === 10 || mes === 12) {
    diacorrecto = 31;
} else if (mes === 4 || mes === 6 || mes === 9 || mes === 11) {
    diacorrecto = 30;
} else if (mes === 2 && ((año % 4) != 0)){
    diacorrecto = 28;
} else if (mes === 2 && ((año % 4) === 0)){
    diacorrecto = 29;
}

// Pedir el día al usuario
do {
    dia = parseInt(prompt("Introduzca el día:"));
    if (dia <= 0 || dia > diacorrecto || isNaN(dia)) {
        alert("Por favor, introduzca un día realista");
    }
} while (dia <= 0 || dia > diacorrecto || isNaN(dia));

// Asignar el nombre del mes al número de mes introducido (Se resta uno, porque la primera posición del array es 0)
nombreMes = meses[mes-1]; 

// Mostrar por pantalla la cadena en negrita
cadena = dia+" de "+nombreMes+" de "+año;
document.write("<p><b>"+cadena+".</b></p>");