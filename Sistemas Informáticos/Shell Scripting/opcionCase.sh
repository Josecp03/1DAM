#!/bin/bash

#Leer la opción
echo "Introduzca la opción:"
read opcion

#Identificar la opción que ha elegido
case $opcion in
   1)
	echo "Ha elegido la opción 1"
	;;
   2)
	echo "Ha elegido la opción 2"
	;;
   *)
	echo "Ha elegido una opción incorrecta"
	;;
esac
