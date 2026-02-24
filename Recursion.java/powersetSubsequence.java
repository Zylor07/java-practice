import java.util.ArrayList;
import java.util.List;

public class powersetSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int targetSum = 2;
        int n = arr.length;

        System.out.println("Subsequences with sum " + targetSum + ":");

        // 1 << n is equivalent to 2 raised to the power of n
        int totalSubsequences = 1 << n; 

        // Iterate through all possible binary masks (0 to 2^n - 1)
        for (int mask = 0; mask < totalSubsequences; mask++) {
            int currentSum = 0;
            List<Integer> subset = new ArrayList<>();

            // Check each bit of the mask
            for (int i = 0; i < n; i++) {
                // If the i-th bit is set (1), include arr[i] in the subset
                if ((mask & (1 << i)) != 0) {
                    subset.add(arr[i]);
                    currentSum += arr[i];
                }
            }

            // Check if the current subset matches our target sum
            if (currentSum == targetSum) {
                System.out.println(subset);
            }
        }
    }
}