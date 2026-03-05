

import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
        HashMap <String,Integer> map=new HashMap<>();
        map.put("Pritam", 90);
        map.put("Amit", 80);
        map.put("Rahul", 70);
        if(map.containsKey("Pritam")){
           System.out.println("Marks: "+map.get("Pritam"));
        }
        else
            System.out.println("not here");

        System.out.println(map.values());

    }
    
}
