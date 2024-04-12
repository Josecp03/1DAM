/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Comienza con una cadena vacía para almacenar los números y sus descripciones.
let cadena = "";

// Bucle que va desde 1 hasta 500.
for (let i = 1; i <= 500; i++) {
    
    // Si el número es múltiplo de 4 y de 9.
    if (i % 4 === 0 && i % 9 === 0) {
        cadena += i + " (Múltiplo de 4 y 9)<br>";
    } 
    // Si el número es solo múltiplo de 4.
    else if (i % 4 === 0) {
        cadena += i + " (Múltiplo de 4)<br>";
    } 
    // Si el número es solo múltiplo de 9.
    else if (i % 9 === 0) {
        cadena += i + " (Múltiplo de 9)<br>";
    } 
    // Si no es múltiplo ni de 4 ni de 9.
    else {
        cadena += i + " <br>";
    }
    // Si el número es múltiplo de 5, se agrega una línea horizontal.
    if (i % 5 === 0) {
        cadena += "<hr>";
    }
}

// Escribir la cadena 
document.write(cadena);
