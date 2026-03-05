
import java.util.HashMap;

public class MajorityElement {
    public static void  solution(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int nums : arr){
    map.put(nums, map.getOrDefault(nums,0) + 1);
    }
    for(int key:map.keySet()){
        if(map.get(key)>=n/2){
            System.out.println(key);   
        }   
    }
    }
    public static void main(String[] args) {
       int nums[] = {-1,-1,-1,2,2};
        solution(nums);
    }
}
