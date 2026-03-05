import java.util.*;

public class ArrrayPermutations {
    public static void findPermutations(int[] arr, List<Integer> current, boolean[] used) {
        // Base Case: If the current list is full, we found a permutation
        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // Skip if the element at this index is already in our current path
            if (used[i]) continue;

            // 1. CHOOSE
            used[i] = true;
            current.add(arr[i]);

            // 2. EXPLORE (Recurse)
            findPermutations(arr, current, used);

            // 3. UN-CHOOSE (Backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[arr.length];

        findPermutations(arr, current, used);
    }
}