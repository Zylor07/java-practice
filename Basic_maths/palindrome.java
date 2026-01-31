
import javax.lang.model.util.ElementScanner14;

class palindrome{
    public boolean  palin(int x){
        int original=x;
        //reverse the number first
        int rev=0;
        
        while(x>0){
           int lastdigit=x%10;
           x=x/10;
            rev=(rev*10)+lastdigit;
        }  
        return  original==rev;
        

       
    }
    public static void main(String[] args) {
        int num=121;
        palindrome obj=new palindrome();
       if (obj.palin(num)){
        System.out.println(num + " has a palindrome which is ");
      

         }
          else { System.out.println("not a palindrome");
           

       }
    }
      
      
}