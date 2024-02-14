#!/bin/sh

echo "Enter a:"
read a

echo "Enter b:"
read b

echo "Enter c:"
read c

D=$(((b*b)-(4*a*c)))

echo "Det is: $D"

flag=""

if [ $D -gt 0 ]
then
flag="1"
elif [ $D -eq 0 ]
then
flag="0"
else
flag="-1"
fi

echo "Flag value is: $flag"

case $flag in
"1")
echo "In 1:"
temp=$(echo "scale=4;sqrt($D)" | bc )

echo "Temp val is: $temp"

root1=$(echo "scale=4; ((-1*$b)+$temp)/(2*$a) " | bc )
root2=$(echo "scale=4; ((-1*$b)-$temp)/(2*$a) " | bc )
echo "Root1 is: $root1"
echo "Root2 is: $root2"
;;

"0")
echo "In 2:"
root=$(( -$b\/(2*$a) ))
echo "Root1 is: $root"
echo "Root2 is: $root"
;;

"-1")
echo "In 3:"
c1=$(( -$b\/(2*$a) ))
c2=$(( (sqrt $D)\/(2*$a) ))
echo "The complex root 1 is: $c1 +i $c2"
echo "The complex root 1 is: $c1 -i $c2"
;;

esac 
exit 0
