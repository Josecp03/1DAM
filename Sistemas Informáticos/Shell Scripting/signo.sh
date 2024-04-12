#!/bin/bash

#Leer el número
echo "Introduzca el número:"
read n

#Comprobar si es positivo, negativo o igual a 0
if [ "$n" -gt 0 ];then
   echo "$n es positivo"
elif [ "$n" -lt 0 ];then
   echo "$n es negativo"
else
   echo "$n es igual a 0"
fi

