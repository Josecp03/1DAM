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
const pedirNumero = () => {
    // Inicializar variables
    let n = 0;

    // Pedir el número al usuario para calcular su factorial
    do {
        n = parseInt(prompt("Introduzca un número:"));
        if (n <= 0 || isNaN(n)) {
            alert("Por favor, introduzca un número positivo");
        }
    } while (n <= 0 || isNaN(n));
    
    return n;
}

const calcularFactorial = () => {
    // Guardar en una variable el número introducido por el usuario
    let n = pedirNumero();

    // Inicializar la variable factorial a 1 para las operaciones
    let factorial = 1;

    // Inicizlizar la variable cadena, que es lo que se va a mostrar por pantalla
    let cadena=n+"! = ";

    // Utilizar un for para ir realizando operaciones e ir concatenando la cadena
    for (let i = n; i >= 1; i--) {
        cadena+=i+" x ";
        factorial = factorial * i;
    }

    //Quitar el último x a la cadena
    cadena = cadena.substring(0, cadena.length - 2);

    // Añadir el resultado a la cadena que se muestra por pantalla
    return cadena+=" = "+factorial;

}

/*
##########################
    PROGRAMA PRINCIPAL
##########################
*/
// Calcular la cadena que contienen el factorial, para imprimirla por pantalla
let cadena = calcularFactorial();

// Mostrar por pantalla la cadena final con el resultado del factorial
document.write(cadena);


