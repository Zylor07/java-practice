
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
        System.out.println("the total elements are: "+current);
        System.out.println("the set of unique elements are: "+s);
        System.out.println("th size of the new set is : "+s.size());
        //tc->o(nlog n)
        //sc->o(n)
    }
    public static int better(int []arr){
        int i=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[i];
                i++;

            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []n={1,1,2,2,4,5,6,7,7};
        brute(n);
        System.out.println(better(n));
    }
}
