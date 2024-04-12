#!/bin/bash

#Leer la primera cadena
echo "Introduzca la primera cadena:"
read a

#Leer la segunda cadena
echo "Introduzca la segunda cadena:"
read b

#Identificar si son iguales
if [ "$a" == "$b" ];then
   echo "$a y $b son iguales"
fi

#Identificar si son distintas
if [ "$a" != "$b" ];then
   echo "$a y $b son distintas"
fi

# Identificar si la cadena está vacía
if [ -z "$a" ] || [ -z "$b" ]; then
   echo "Existe una cadena vacía"
fi

# Identificar si la cadena no está vacía
if [ -n "$a" ] || [ -n "$b" ]; then
   echo "Existe una cadena que no está vacía"
fi


# Identificar el orden alfabético ascendente
if [ "$a" \< "$b" ]; then
   echo "$a es menor que $b"
elif [ "$a" \> "$b" ]; then
   echo "$b es menor que $a"
fi

# Identificar el orden alfabético descendente
if [ "$a" \> "$b" ]; then
   echo "$a es mayor que $b descendentemente"
elif [ "$a" \< "$b" ]; then
   echo "$b es mayor que $a descendentemente"
fi
