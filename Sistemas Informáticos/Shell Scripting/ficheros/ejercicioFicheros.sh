#!/bin/bash

#Comprobar si existe un fichero
if [ -e fichero.txt ];then
   echo "fichero.txt existe"
fi

#Comprobar que es un fichero ordinario
if [ -f fichero.txt ];then
   echo "fichero.txt es un fichero ordinario"
fi

#Comprobar que es un fichero vacío
if [ ! -s fichero.txt ];then
   echo "fichero.txt es un fichero vacío"
fi

#Comprobar si es un directorio
if [ -d directorio ];then
   echo "directorio es un directorio"
fi

#Comprobar que tenga permisos de lectura
if [ -r scriptConPermisos.sh ];then
   echo "scriptConPermisos tiene permisos de lectura"
fi

#Comprobar que tenga permisos de escritura
if [ -w scriptConPermisos.sh ];then
   echo "scriptConPermisos tiene permisos de escritura"
fi

#Comprobar que tenga permisos de ejecucuión
if [ -x scriptConPermisos.sh ];then
   echo "scriptConPermisos tiene permisos de ejecución"
fi


