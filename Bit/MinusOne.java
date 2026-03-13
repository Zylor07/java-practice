public class MinusOne {
    public static void main(String[] args) {
        int n=7;
        int result=n&(n-1);
        System.out.println(result);
    }
    
}
/*🔥 Next Concept (VERY IMPORTANT)

Now we should learn the most powerful trick in bit manipulation:

n & (n - 1)

This trick is used for:

1️⃣ Power of Two problem
2️⃣ Counting set bits faster
3️⃣ Subset generation
4️⃣ Bitmask problems

Almost every coding interview expects this trick.

Example:

n = 8
1000
n-1 = 7
0111
1000
0111
----
0000

Lowest set bit disappears. */