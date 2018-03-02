#!/bin/bash
Unix=(Debian "Red Hat" Ubuntu Suse Fedora)
echo "Content of array"
echo ${Unix[*]}
echo "Length"
echo ${#Unix[*]}
echo "Number on index 2"
echo ${#Unix[2]}
echo "Two numbers from index 3"
echo ${Unix[3]}
echo ${Unix[4]}
echo "Search and Replace"
echo ${Unix[*]/"Ubuntu"/"SCO"}
echo "Add Element"
Unix[5]=AIX
Unix[6]=HP-UX
echo "Remove Element"
unset Unix[3]
Linux=(${Unix[*]})
echo "Content of array"
echo ${Linux[*]}
Bash=(${Unix[*]} ${Linux[*]})
echo ${Bash[*]}
unset Linux[*]
unset Unix[*]
