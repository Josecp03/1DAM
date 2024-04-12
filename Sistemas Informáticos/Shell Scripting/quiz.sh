#!/bin/bash

#Entrar a la carpeta de las puntuaciones si existe, y si no se crea
if [ ! -e Puntuaciones ];then
   mkdir Puntuaciones
   cd Puntuaciones
elif [ -e Puntuaciones ];then
   cd Puntuaciones
fi

#Preguntar el nombre al usuario
echo "Introduzca su nombre:"
read nombre

#Si existe ya un archivo con las puntuaciones del nombre introducido
#muestra la puntuación anterior
if [ -e Puntuación$nombre.txt ];then
   echo "La puntuación anterior de $nombre es:"
   cat "Puntuación$nombre.txt"
   echo "¿Desea continuar?(s/n)"
   read continuar
   if [ $continuar == "n" ];then
	echo "Saliendo del programa"
	exit 0
   fi
fi

#Crear un archivo .txt con las puntuaciones del usuario introducido
#si no esta creado ya anteriormente

if [ ! -e Puntuación$nombre.txt ];then
   touch Puntuación$nombre.txt
fi

#Inicializar el contador a 0
p=0

#Recorrer las preguntas
for i in $(seq 1 10);do
   case $i in
	1)
	   echo "$i) ¿Cúal es la capital de España?"
	   echo -e "\ta) Madrid"
	   echo -e "\tb) Barcelona"
	   echo -e "\tc) Toledo"
	   respuestaCorrecta=a
	;;
	2)
	   echo "$i) ¿Cuál es el río más largo del mundo?"
	   echo "a) El Nilo"
	   echo "b) El Amazonas"
	   echo "c) El Yangtsé"
	   respuestaCorrecta=b
	;;
        3)
           echo "$i) ¿Cuál es la capital de Australia?"
           echo "a) Sidney"
           echo "b) Melbourne"
           echo "c) Canberra"
           respuestaCorrecta=c
        ;;
        4)
           echo "$i) ¿Quién pintó La noche estrellada?"
           echo "a) Pablo Picasso"
           echo "b) Vincent van Gogh"
           echo "c) Leonardo da Vinci"
           respuestaCorrecta=b
        ;;
        5)
           echo "$i) ¿Cuál es el metal más abundante en la corteza terrestre?"
           echo "a) Hierro"
           echo "b) Aluminio"
           echo "c) Oro"
           respuestaCorrecta=b
        ;;
        6)
           echo "$i) ¿En qué año llegó el hombre a la Luna por primera vez?"
           echo "a) 1969"
           echo "b) 1959"
           echo "c) 1979"
           respuestaCorrecta=a
        ;;
        7)
           echo "$i) ¿Quién fue el primer presidente de Estados Unidos?"
           echo "a) Thomas Jefferson"
           echo "b) George Washington"
           echo "c) Abraham Lincoln"
           respuestaCorrecta=b
        ;;
        8)
           echo "$i) ¿Cuál es el elemento químico con el símbolo Fe?"
           echo "a) Plata"
           echo "b) Oro"
           echo "c) Hierro"
           respuestaCorrecta=c
        ;;
        9)
           echo "$i) ¿Cuál es el océano más grande del mundo?"
           echo "a) El Atlántico"
           echo "b) El Índico"
           echo "c) El Pacífico"
           respuestaCorrecta=c
        ;;
        10)
           echo "$i) ¿Cuál es la moneda oficial de Japón?"
           echo "a) Yen"
           echo "b) Yuan"
           echo "c) Dólar"
           respuestaCorrecta=a
        ;;
   esac

   #Leer la respuesta del usuario
   echo "Respuesta:"
   read respuesta

   #Comprobar si la respuesta es correcta
   if [ "$respuesta" == "$respuestaCorrecta" ];then
	((p++))
   fi

done

#Mostrar cuántas preguntas he acertado
echo "Has acertado $p preguntas"

#Poner la puntuación en el archivo .txt
echo "$p" > Puntuación$nombre.txt
