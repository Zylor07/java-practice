
import java.util.HashMap;

public class HowManyCount {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,3,4,4,4,4,5};
        HashMap <Integer,Integer> cn=new HashMap<>();
        for(int num:arr){
            if(cn.containsKey(num)){
                cn.put(num,cn.get(num)+1);

            }
            else
                cn.put(num, 1);
        }
        System.out.println(cn);
    }

    
}
