#!bin/bash
read -p "Enter a String: " str
read -p "Enter starting index and no of characters: " a b
substr=${str:$a:$b}
echo "Substring: $substr"