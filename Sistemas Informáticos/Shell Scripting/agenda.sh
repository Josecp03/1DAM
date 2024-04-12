#!/bin/bash

#FUNCIONES
#Función de añadir
anadir(){
   echo "Introduzca su nombre:"
   read nombre
   echo "Introduzca su teléfono:"
   read telefono
   echo "$nombre $telefono" >> Agenda.txt
   echo "Contacto añadido con éxito"
}

#Función de buscar
buscar(){
   echo "Introduzca el nombre del contacto que desea buscar:"
   read nom
   echo "Introduzca el teléfono del contacto que desea buscar:"
   read tel
   busqueda=$(grep "$nom $tel" Agenda.txt)
   if [ "$busqueda" == "$nom $tel" ];then
	echo "Su contacto está en la agenda"
   else
	echo "Su contacto no está en la agenda"
   fi
}

#Función de editar
editar(){
   echo "Introduzca el nombre de sus contactos que quiere editar:"
   read no
   echo "Introduzca el telefono de sus contactos que quiere editar:"
   read telf
   echo "Introduzca el nuevo nombre:"
   read nuevoNo
   echo "Introduzca el nuevo teléfono:"
   read nuevoTelf
   sed -i "s/$no $telf/$nuevoNo $nuevoTelf/g" Agenda.txt
   echo "Contacto editado con éxito"
}

#Función de borrar
borrar(){
   echo "Introduzce el teléfono del contacto que desea borrar:"
   read tfno
   sed -i "/$tfno/d" Agenda.txt
   echo "Contacto borrado con éxito"
}

#Primero, crear el fichero de texto de agenda donde vamos a escribir nuestros contactos.
#Siempre y cuando no exista, claro
if [ ! -e Agenda.txt ];then
   touch Agenda.txt
fi

#Imprimir el menú por pantalla
while [ "$opcion" != "5" ]
do
   echo -e "\t1) Añadir contacto"
   echo -e "\t2) Buscar contacto"
   echo -e "\t3) Editar contacto"
   echo -e "\t4) Borrar contacto"
   echo -e "\t5) Salir"

   #Leer la ocpión elegida
   read opcion

   #Realizar un case para cada una de las opciones
   case $opcion in
	1)
           añadir
           ;;
	2)
           buscar
           ;;
  	3)
           editar
           ;;
   	4)
           borrar
           ;;
  	5)
           echo "Saliendo del programa"
           exit 0
	   ;;
	*)
	   echo "Opción incorrecta"
	   ;;
   esac
done

