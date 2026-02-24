import java.util.ArrayList;
import java.util.List;

public class sumofSubsequence {
    public static void  Subsequence(int[] arr, int index, List<Integer> current, int sum,int target){
        if (index == arr.length) {
            if (sum == target) {
                System.out.println(current);
            }
            return;
        }
        current.add(arr[index]);
        sum+=arr[index];
        Subsequence(arr,index+1,current,sum,target);
        sum -= arr[index];
        current.remove(current.size() - 1);
        Subsequence(arr, index + 1, current, sum, target);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;
        System.out.println("Subsequences that sum to " + target + ":");
         Subsequence(arr, 0, new ArrayList<>(), 0, target);}
    
}

/**
     * @param arr     The input array
     * @param index   The current element index we are considering
     * @param current The current list of integers in the subsequence
     * @param sum     The running sum of elements in 'current'
     * @param target  The required sum we are looking for
     */
