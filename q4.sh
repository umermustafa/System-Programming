#!/bin/bash
array=(`cat f1`)
echo "Contents" ${array[*]}
echo "Length" ${#array[*]}
echo "Length" ${#array[2]} 
