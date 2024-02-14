#/!bin/sh


echo "Present Working directory is: $pwd" 
echo "List all file under the i/p dir: "

ls | wc -l

echo "................................."

echo "Dir_name: $direcname, Files under this directory whose extension has only one character:"
ls *.[a-z]

cd ..
exit 0

