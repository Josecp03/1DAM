#!/bin/bash

#Inicializar las variables pares e impares
pares=""
impares=""

#Hacer un for del 1 al 10
for ((i=1; i<=10; i++))
do
   if [ $((i % 2)) -eq 0 ];then
	pares="$pares $i"
   else
	impares="$impares $i"
   fi
done

echo "Pares = $pares"
echo "Impares = $impares"
