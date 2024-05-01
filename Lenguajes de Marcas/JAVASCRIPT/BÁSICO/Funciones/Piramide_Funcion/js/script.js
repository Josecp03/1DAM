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
// Función de flecha para calcular una pirámide de números del 1 al 30
const realizarPiramide = () => {
    // Inicializar la variable cadena
    let cadena = "";

    // Realizar un for para guardar en la cadena los números de la pirámide
    for (let i = 1; i <= 30; i++) {
        for (let j = 1; j <= i; j++) {
            cadena += i;
        }
        cadena += "<br>";
    }

    // Devolver la cadena generada
    return cadena;
}

/*
##########################
    PROGRAMA PRINCIPAL
##########################
*/
// Guardar en la varible cadena la pirámide de números
let cadena = realizarPiramide();

// Escribir por pantalla la pirámide
document.write("<div>"+cadena+"</div>");


