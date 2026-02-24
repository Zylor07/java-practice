public class OnetoNbacktracking {
 

    static void print1toN(int n){
        if(n == 0) return;      // base case

        print1toN(n - 1);       // recursive call (go deeper first)

        System.out.print(n + " ");   // print during backtracking
    }

    public static void main(String[] args){
        int n = 5;
        print1toN(n);
    }
}
    

