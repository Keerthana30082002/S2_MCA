#!/bin/bash
read -p "Enter directory name you want to search: " dir for filename in "D:/S2_MCA/$dir"
do
if [ -d "$filename" ]
then
echo "$filename is a directory"
else
echo "$filename is not directory"
fi
done