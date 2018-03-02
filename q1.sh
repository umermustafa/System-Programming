#!/bin/bash

read -p "Enter number" n1
read -p "Enter number" n2

expr $n1 + 0 
if [ $? -eq 0  ]
then 
	expr $n2 + 0
	if [ $? -eq 0 ]
	then
		echo "Addition" 
echo `expr $n1 + $n2`
		echo "Subtracion"
echo  `expr $n1 - $n2`
		echo "Multiplication"
echo `expr $n1 \* $n2`
		echo "Division" 
echo `expr $n1 / $n2`
		
	else
		echo "Not valid"
	fi
		 			
else
	echo "not valid"

fi 
