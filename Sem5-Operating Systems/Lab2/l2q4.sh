#/!bin/sh

echo "Number of files in the current directory:"

ls -l | grep "^-" | wc -l
exit 0