#!/bin/bash

#Inicializo el array
nombres=("Manu" "José" "Alfonso" "Guille" "Álvaro")

#Conseguir la longitud del array
longitud=${#nombres[@]}

for ((i=0; i<longitud; i++));do
   echo "Nombre ${i}: ${nombres[i]}"
done
