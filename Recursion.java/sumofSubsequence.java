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
