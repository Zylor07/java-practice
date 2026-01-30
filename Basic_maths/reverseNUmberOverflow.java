public class reverseNUmberOverflow {

    public int reverse(int x) {
        int rev=0;
        while (x!=0){
            int digit=x%10;
            x=x/10;
            //overflow check
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && digit<-8)){
                return 0;

            }
            rev=(rev*10)+digit;
        }
        return rev;
        
    }
    public static void main(String[] args) {
         reverseNUmberOverflow obj=new reverseNUmberOverflow();
          System.out.println(obj.reverse(1007));     // 7001
        System.out.println(obj.reverse(-123));
    }
}

