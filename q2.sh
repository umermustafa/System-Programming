
#!/bin/bash

uname1=$2
f1=$1
f2=$3
set `ls -li $1` 

owner=$5
echo "Owner: " $owner

echo "Group: " $4
echo "Permissions: " $2
		shift
echo "Filename: " $9
if [ $owner = $uname1 ] 
	then

echo "Cheating: " 0
	else
	echo "Cheating: " 1
fi

if ( ${#f2} -gt 0 && test ${f2} != $uname1 )
then
	set `ls -li ${f2[0]}` 

	echo "Owner: " $5
echo "Group: " $4
	echo "Permissions: " $2
		shift
echo "Filename: " $9
	diff -c $f1 $9
	if [ $? -eq 0 ]
	then 

echo "NO cheating" 1>f3.txt

else
	echo "Cheating" 1>f3.txt
	fi
fi

    

