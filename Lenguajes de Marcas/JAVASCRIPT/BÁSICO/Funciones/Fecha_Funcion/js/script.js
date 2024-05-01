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
const pedirAño = () => {
    // Inicializar variables
    let año = 0;

    // Pedir el año al usuario
    do {
        año = parseInt(prompt("Introduzca el año:"));
        if (año < 0 || isNaN(año)) {
            alert("Por favor, introduzca un año real");
        }
    } while (año <= 0 || isNaN(año));

    // Devolver el año
    return año;
}

const pedirMes = () => {
    // Inicializar variables
    let mes = 0;

    // Pedir el mes al usuario
    do {
        mes = parseInt(prompt("Introduzca el mes:"));
        if (mes <= 0 || mes > 12 || isNaN(mes)) {
            alert("Por favor, introduzca un mes realista");
        }
    } while (mes <= 0 || mes > 12 || isNaN(mes));

    // Devolver el mes
    return mes;
}

const calcularDiaCorrecto = (mes,año) => {
    
    // Inicializar variables
    let diacorrecto = 0;

    // Calcular el día correcto del mes
    if (mes === 1 || mes === 3 || mes === 5 || mes === 7 || mes === 8 || mes === 10 || mes === 12) {
        diacorrecto = 31;
    } else if (mes === 4 || mes === 6 || mes === 9 || mes === 11) {
        diacorrecto = 30;
    } else if (mes === 2 && ((año % 4) != 0)){
        diacorrecto = 28;
    } else if (mes === 2 && ((año % 4) === 0)){
        diacorrecto = 29;
    }
    
    // Devolver el día correcto
    return diacorrecto
}

const pedirDia = (diacorrecto) => {
    // Inicializar variables
    let dia = 0;

    // Pedir al usuario el día
    do {
        dia = parseInt(prompt("Introduzca el día:"));
        if (dia <= 0 || dia > diacorrecto || isNaN(dia)) {
            alert("Por favor, introduzca un día realista");
        }
    } while (dia <= 0 || dia > diacorrecto || isNaN(dia));

    // Devolver el día
    return dia;
}

/*
##########################
    PROGRAMA PRINCIPAL
##########################
*/
let meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Diciembre"];

// Pedir el año al usuario
let año = pedirAño();

// Pedir el mes al usuario 
let mes = pedirMes();

// Calcular el día correcto para el mes introducido
let diaCorrecto = calcularDiaCorrecto(mes,año);

// Pedir el día al usuario
let dia = pedirDia(diaCorrecto);

// Asignar el nombre del mes al número de mes introducido (Se resta uno, porque la primera posición del array es 0)
nombreMes = meses[mes-1]; 

// Mostrar por pantalla la cadena en negrita
cadena = dia+" de "+nombreMes+" de "+año;
document.write("<p><b>"+cadena+".</b></p>");