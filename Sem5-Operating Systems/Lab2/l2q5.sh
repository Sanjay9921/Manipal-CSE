#/!bin/sh

echo "Sorted file 1: $1"

echo "Sorted file 2: $2"

cp $1 new

cat $2>>new

sort new

echo "Sorted file 1 and 2 is: $new"

exit 0