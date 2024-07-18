read -p "Enter a String: " s
l=${#s}
ns=""
for i in $(seq $l -1 1)
do
a=$(expr substr "$s" $i 1)
ns="$ns$a"
done
echo "Reversed String is : $ns"