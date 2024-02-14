#!/bin/sh

echo "Enter n: "
read n

k=1

while [ $k -le $n ]
do
echo $k
k=$((k+2))
done
