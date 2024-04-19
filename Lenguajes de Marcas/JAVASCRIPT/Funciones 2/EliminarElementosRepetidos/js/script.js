/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Función para eliminar los elementos repetidos de un array
const eliminarRepetidos=(array) => {
    
    // Inicializar variable
    let nuevoArray=[];

    // Inicializar contadores
    let auxCont=0;
    let cont=0;

    // Iterar con un for todos los elementos del array
    for (let i = 0; i < array.length; i++) {

        // Iterar un segundo for para comparar el elemento acual del array con todos los demás
        for (let j = 0; j < array.length; j++) {

            // Comprobar si el elemento está repetido
            if(array[i] == array[j]){
                auxCont++;
            }
        }

        // Si el elemento no está repetido, guardarlo en el nuevo array
        if(auxCont == 1){
            nuevoArray[cont] = array[i];
            cont++;
        }

        // Volver a iniciar el contador a 0 para el siguiente elemento
        auxCont = 0;

    }

    return nuevoArray;
}

// Inicializar el array
let array = [1,2,3,2,1,4,5,3];

// Inicializar la variable cadena que vamos a mostrar por pantalla
let cadena = "<h2>ARRRAY ORIGINAL</h2>["+array.toString()+"]";

// Eliminar los elementos repetidos del array
let nuevoArray = eliminarRepetidos(array);

// Añadir el resultado a la cadena que vamos a mostrar por pantalla
cadena += "<h2>ARRAY SIN REPETIDOS</h2>["+nuevoArray.toString()+"]"; 

// Imprimir por pantalla la cadena
document.write(cadena);

