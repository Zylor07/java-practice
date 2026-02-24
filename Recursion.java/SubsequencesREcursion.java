import java.util.ArrayList;
import java.util.List;

public class SubsequencesREcursion {
   public static void findSubsequences(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }
        findSubsequences(str, index + 1, current + str.charAt(index), result);// pick it
        findSubsequences(str, index + 1, current, result);//not peak it
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        findSubsequences(str, 0, "", result);
        System.out.println(result);
    }
    
}

    /*
     * Function to generate all subsequences of a string
     *
     * str     → original input string
     * index   → current position in the string we are deciding on
     * current → subsequence formed so far
     * result  → list storing all subsequences
     */