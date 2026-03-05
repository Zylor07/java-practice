import java.util.HashMap;

public class firstRepeatingChar {
    public static void main(String[] args) {

        String word = "Programming";

        HashMap<Character,Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        // Step 2: find first non-repeating
        for(char c : word.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First non repeating character: " + c);
                break;
            }
        }
    }
}