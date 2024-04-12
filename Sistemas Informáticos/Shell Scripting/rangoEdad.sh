#!/bin/bash

#Leer la edad
echo "Introduzca su edad:"
read edad

#Comprobar si es un niño
if [ "$edad" -gt 0 ] && [ "$edad" -le 14 ];then
   echo "Usted es un niño"
elif [ "$edad" -gt 14 ] && [ "$edad" -le 20 ];then
   echo "Usted es un adolescente"
elif [ "$edad" -gt 20 ] && [ "$edad" -le 35 ];then
   echo "Usted es un adulto joven"
elif [ "$edad" -gt 35 ] && [ "$edad" -le 65 ];then
   echo "Usted es un adulto"
elif [ "$edad" -gt 65 ] && [ "$edad" -le 100 ];then
   echo "Usted es una persona mayor"
elif [ "$edad" -gt 100 ] && [ "$edad" -le 150 ];then
   echo "Usted es una persona muy mayor"
else
   echo "Edad incorrecta"
fi
