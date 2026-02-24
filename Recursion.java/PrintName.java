public class PrintName {
    public static void nums(int n,int count){
        if(count==n){
            return;
        }
        System.out.println("Pritam Chakraborty");
        nums(n, count+1);
    }


    public static void main(String[] args) {
        nums(5, 0);
        
    }
    
}
