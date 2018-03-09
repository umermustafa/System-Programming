#!/bin/bash

showTable()
{
   
if [ $# -eq 0 ]
	then echo "No arguments passed"
fi

if [ $# -eq 1 ]
then 
	for i in `seq 1 10`
	do 
		echo `expr $i \* $1`
	done   
fi

if [ $# -eq 2  ]
then echo "enter three arguments"
fi

if [ $# -eq 4  ]
then echo "enter five arguments"
fi


if [ $# -eq 3 ]
	then 
		if [ $2="-s" ]
		then 
			for i in `seq $3 10`
			do 
			echo `expr $i \* $1`
			done
		fi	
fi	

if [ $# -eq 3 ]
	then 
		if [ $2="-e" ]
		then 
			for i in `seq 1 $3`
			do 
			echo `expr $i \* $1`
			done
		fi	
fi	

if [ $# -eq 5 ]
	then 
		if [ $2="-s" ] && [ $4="-e" ]
		then 
			for i in `seq $3 $5`
			do 
			echo `expr $i \* $1`
			done
		fi	
fi	

if [ $# -eq 6 ]
	then 
		if [ $2="-s" ] && [ $4="-e" ] && [ $6="-r" ] 
		then 
			for i in `seq $3 $5`
			do 
			echo `expr $i \* $1`
			done
		j=$5

		while [ $j -ge $3 ]		
		do
		echo `expr $j \* $1`
		j=`expr $j -1`
		done
		fi	
fi	

if [ $# -gt 6 ]
	then echo "arguments greater than limit"
fi  	
}

showTable $@
