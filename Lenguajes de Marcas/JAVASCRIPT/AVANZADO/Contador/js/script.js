/*
░░░░░██╗░█████╗░░██████╗███████╗
░░░░░██║██╔══██╗██╔════╝██╔════╝
░░░░░██║██║░░██║╚█████╗░█████╗░░
██╗░░██║██║░░██║░╚═══██╗██╔══╝░░
╚█████╔╝╚█████╔╝██████╔╝███████╗
░╚════╝░░╚════╝░╚═════╝░╚══════╝*/

// Inicializar variable
let menos = document.getElementById('menos');
let mas = document.getElementById('mas');
let reset = document.getElementById('reset');
let numero = document.getElementById('numero');

let contador=0;

menos.onclick = function() {
    contador--;
    numero.innerText = contador;
    comprobarColor(contador);
}

mas.onclick = function() {
    contador++;
    numero.innerText = contador;
    comprobarColor(contador);
}

reset.onclick = function() {
    contador = 0;
    numero.innerText = contador;
    comprobarColor(contador);
}

const comprobarColor = (cont) => {
    if (cont < 0) {
        numero.style.color = 'red';
    } else if (cont > 0) {
        numero.style.color = 'green';
    } else {
        numero.style.color = 'white';
    }
}