#!/bin/bash



#Leer la primera cadena
echo "Introduzca la primera cadena:"
read cadena1

#Leer la segunda cadena
echo "Introduzca la segunda cadena:"
read cadena2

#Comprobar si son iguales independientemente de las mayúsculas y minúsculas
if [ "${cadena1,,}" = "${cadena2,,}" ];then
  echo "$cadena1 y $cadena2 son iguales"
else
   echo "$cadena1 y $cadena2 son distintas cadenas"
fi
