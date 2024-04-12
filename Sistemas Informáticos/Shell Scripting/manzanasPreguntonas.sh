#!/bin/bash

#Borrar la carpeta manzanas si ya existía anteriormente
if [ -e Manzanas ];then
   rm -r Manzanas
fi

#Crear la carpeta Manzanas si no existiera
if [ ! -e Manzanas ];then
   mkdir Manzanas
fi

#Entrar en la carpeta de Manzanas
cd Manzanas

# Inicializo la variable del número de manzanas que quiero crear
numManzanas=10

# Crear el número de manzanas indicado
for i in $(seq 1 $numManzanas); do
   touch Manzana$i.txt
   echo "¿Quieres poner un gusano en la manzana $i? (s/n)"
   read respuesta
   if [ "$respuesta" = "s" ]; then
        echo 1 > Manzana$i.txt
   else
	echo 0 > Manzana$i.txt
   fi
done

#Contar el número de gusanos que hay
cont=0
for i in $(seq 1 $numManzanas);do
   if [ $(cat Manzana$i.txt) -eq 1 ];then
        cont=$(($cont + 1))
   fi
done

#Mostrar por pantalla cuantos gusanos hay
echo "Hay un total de $cont en las $numManzanas manzanas"

