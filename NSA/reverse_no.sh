#!/bin/bash
read -p "Enter a number: " n
no=$n
p=0
while [ $n -gt 0 ]
do
d=$(($n % 10))
p=$(($p * 10 + d))
n=$(($n / 10))
done
echo "Reversed Number: $p"