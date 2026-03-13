public class FlipAllBits {
    public static void main(String[] args) {
        int n=5;
        int result=~n;
        System.out.println(result);
    }
    
}
/*Why It Prints -6

Java integers use 32 bits (two's complement).

5 = 00000000 00000000 00000000 00000101

After ~:

~5 =
11111111 11111111 11111111 11111010

That binary represents -6.

So Java prints -6. */