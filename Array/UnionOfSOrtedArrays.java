
import java.util.HashSet;
import java.util.Set;

//Bruteforce
public class UnionOfSOrtedArrays {
    public static  void solution(int arr1[],int arr2[]){
        Set <Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);

        }
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);

        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int aa[]={1,1,2,3,4,5};
        int bb[]={2,3,4,5,6,7};
        solution(aa, bb);
    }

      
    


    
}
