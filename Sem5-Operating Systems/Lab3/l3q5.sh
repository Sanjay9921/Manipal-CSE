#!/bin/sh

echo "Enter a:"
read a
echo "Enter b:"
read b

echo "Enter operation choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division"

read flag

case $flag in
"1")
temp=$(( $a+$b ))
echo "$temp"
;;

"2")
temp=$(( $a-$b ))
echo "$temp"
;;

"3")
temp=$(( $a*$b ))
echo "$temp"
;;

"4")
temp=$(( $a\/$b ))
echo "$temp"
;;

esac

exit 0

