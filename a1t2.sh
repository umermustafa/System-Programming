#!/bin/bash

file=$1
i=0

touch evenfile
touch oddfile

if [ $# -eq 0 ]
then 
	echo "No arguments passed"
fi

if [ ! -f $file ]
then 
	echo "Not found"
fi

while read line 
do

	evenlines=$( expr $i % 2 )
	
	if [ $evenlines -ne 0 ]
	then 
	echo $line >> $evenfile
	else
	echo $line >> $oddfile
	fi
	i=`expr $i+1`
done < $file
