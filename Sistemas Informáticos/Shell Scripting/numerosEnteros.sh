#!/bin/bash

#Leer el primer número
echo "Introduzca el primer número:"
read a

#Leer el segundo número
echo "Introduzca el segundo número:"
read b

#Identificar si son iguales
if [ "$a" -eq "$b" ];then
   echo "$a y $b son iguales"
fi

#Identificar si son distintos
if [ "$a" -ne "$b" ];then
   echo "$a y $b son distintos"
fi

#Identificar cúal es mayor
if [ "$a" -gt "$b" ];then
   echo "$a > $b"
elif [ "$b" -gt "$a" ];then
   echo "$b > $a"
fi

#Identificar cúal es menor
if [ "$a" -lt "$b" ];then
   echo "$a < $b"
elif [ "$b" -lt "$a" ];then
   echo "$b < $a"
fi

#Identificar cúal es mayorIgual
if [ "$a" -ge "$b" ];then
   echo "$a >= $b"
elif [ "$b" -ge "$a" ];then
   echo "$b >= $a"
fi

#Identificar cúal es menorIgual
if [ "$a" -le "$b" ];then
   echo "$a <= $b"
elif [ "$b" -le "$a" ];then
   echo "$b <= $a"
fi

