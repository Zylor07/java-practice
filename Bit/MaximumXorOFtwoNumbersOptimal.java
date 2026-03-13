import java.util.HashSet;
public class MaximumXorOFtwoNumbersOptimal {
    public static void main(String[] args)
    {
        int arr[] = {3,10,5,25,2,8};

        int max = 0;
        int mask = 0;

        for(int i = 31; i >= 0; i--){

            mask |= (1 << i);

            HashSet<Integer> set = new HashSet<>();

            for(int num : arr)
                set.add(num & mask);

            int candidate = max | (1 << i);

            for(int prefix : set){

                if(set.contains(prefix ^ candidate)){
                    max = candidate;
                    break;
                }
            }
        }

        System.out.println(max);
    }
}
    /*
    Time  : O(32 * n)
Space : O(n)
 */

