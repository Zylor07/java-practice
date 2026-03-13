public class SingleNumberIII
{
	public static void main(String[] args) {

	    int arr[] = {1,2,1,3,2,5};
	    int n = 0;

	    for(int i = 0; i < arr.length; i++){
	        n ^= arr[i];
	    }

	    int rightmost = (n & (-n));

	    int num1 = 0;
	    int num2 = 0;

	    for(int num : arr){
	        if((num & rightmost) != 0)
	            num1 ^= num;
	        else
	            num2 ^= num;
	    }

	    System.out.println(num1 + " " + num2);
	}
}




/*
🧠 What Each Part Does
1️⃣ XOR all elements
1 ^ 2 ^ 1 ^ 3 ^ 2 ^ 5

Duplicates cancel:

1^1 = 0
2^2 = 0

So:

xor = 3 ^ 5
2️⃣ Find rightmost set bit
rightmost = xor & (-xor)

Example:

xor = 6
110
-xor = -6
010
110
010
---
010

This isolates the lowest set bit where the two numbers differ.

3️⃣ Divide numbers into two groups

Using that bit.

Group 1:

2,2,3

Group 2:

1,1,5

XOR inside each group removes duplicates.

Result:

3
5
⏱ Complexity

Time:

O(n)

Space:

O(1)

Optimal solution. */