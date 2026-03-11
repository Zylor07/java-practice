import java.util.HashSet;
import java.util.Set;

public class rmveDuplicates {

    public static void brute(int []arr){
        int current=0;
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
            current++;
        }

        System.out.println("Total elements: "+current);
        System.out.println("Unique elements set: "+s);
        System.out.println("Size of unique set: "+s.size());

        // TC -> O(n)
        // SC -> O(n)
    }

    public static int better(int []arr){
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int []n={1,1,2,2,4,5,6,7,7};

        brute(n);

        System.out.println("Unique count using two pointer: "+better(n));
    }
}