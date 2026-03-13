public class BitCountOptimal {
 
    public static void main(String[] args)
    {
        int n = 7;
        int count = 0;

        for(int i = 0; (1 << i) <= n; i++){

            int cycle = 1 << (i + 1);

            int completeCycles = (n + 1) / cycle;

            count += completeCycles * (1 << i);

            int remainder = (n + 1) % cycle;

            count += Math.max(0, remainder - (1 << i));
        }

        System.out.println(count);
    }
}
    
/*
Time  → O(log n)
Space → O(1)
 */
