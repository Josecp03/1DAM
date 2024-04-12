#!/bin/bash

#Leer el primer número
echo "Introduzca el primer número:"
read a

#Leer el segundo número
echo "Introduzca el segundo número:"
read b

#Suma
echo "$a + $b = $((a+b))"

#Resta
echo "$a - $b = $((a-b))"

#Multiplicación
echo "$a x $b = $((a*b))"

#División
echo "$a / $b = $((a/b))"

#Módulo
echo "$a % $b = $((a % b))"
