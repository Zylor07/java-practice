public class fibonacci {
    public static int multipleRecursion(int n){
        if(n<=1){
            return 1;
        }
        return multipleRecursion(n-1)+ multipleRecursion(n-2);

    }
    public static void main(String[] args) {
        System.out.println(multipleRecursion(104));
        
    }
    
}