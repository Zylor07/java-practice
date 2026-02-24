public class printNto1 {
   public static void nums(int n,int count){
    if(count==0){
        return;
    }
    System.out.println(count);
    nums(n, count-1);
   }


    public static void main(String[] args) {
        nums(5, 5);
        
    }
    
}
