import java.util.*;

public class printAlldivisors {

    public int[] divisor(int n){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        Collections.sort(list);

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args){

        printAlldivisors obj = new printAlldivisors();
        int[] result = obj.divisor(12);

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}