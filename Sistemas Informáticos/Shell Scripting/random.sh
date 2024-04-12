#!/bin/bash

#Generar el número aleatorio
random=$((RANDOM % 100 + 1))
echo "$random"

#Inicializar la variable intentos a 0
intentos=0

while [ "$n" != "$random" ] && [ "$intentos" -lt 5 ]
do
   echo "Introduzca el número:"
   read n
   if [ "$random" -lt "$n" ];then
	echo "El número a adivinar es MENOR"
   elif [ "$random" -gt "$n" ];then
	echo "El número a adivinar es MAYOR"
   fi
   ((intentos++))
   if [ "$random" -ne "$n" ] && [ "$intentos" -lt 5 ];then
	echo "Te quedan $((5 - $intentos)) intentos"
   fi
done

if [ "$intentos" -eq 5 ];then
   echo "Has perdido :(, el número era $random"
else
   echo "EL número era $random, lo has acertado!!!"
fi

