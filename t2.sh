#!/bin/bash

showAllOwners()
{
	if [ $# -eq 0 ]
	then 
	echo "no arguments passed"
	fi

	if [ $# -gt 1 ]
	then 
	echo "Arguments greater than limit"
	fi

	user=$1
	for i in `ls`
	do 
	set `ls -li $i`
	shift
	if [ -f $i ]
	then
	if [ $user=$3 ]
	then 
	echo "FileOwner: "$3
	shift
	echo "FileName: " $8
	fi 
	fi
	done
   
cd ~/
}
showAllOwners $1


