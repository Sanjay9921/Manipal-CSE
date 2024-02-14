#!/bin/sh

echo "Enter a number:"
read n

fact=$n

until [ $n -eq 1 ]
do
fact=$(($fact*($n-1)))
n=$((n-1))
done

echo "Fact: $fact"

exit 0
