#/!bin/sh

echo "Present Working directory is: $pwd" 

ls | wc -l

echo "................................."

echo "Files under this directory whose extension has only one character:"
ls *.[a-z]

cd ..
exit 0

