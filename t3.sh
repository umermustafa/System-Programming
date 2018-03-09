#!/bin/bash

RunningProcess()
{
	file=$1
	set `ps -all -A | grep  $file`
	echo "PID: " $4
	echo "PPID: "$5
	shift 5
	echo "Name: "$9
	echo "State:Running"
}
	
RunningProcess $1
