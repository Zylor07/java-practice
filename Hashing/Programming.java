
import java.util.HashMap;

public class Programming {
    public static void main(String[] args) {
        String word = "Programming";
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: word.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);

            }
            


        }
        System.out.println(map);
    }
    
}
