#!/bin/bash


unique=`sort $1 | uniq -u`
echo $unique


