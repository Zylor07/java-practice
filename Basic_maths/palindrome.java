


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
        System.out.println(num + " has a palindrome which  ");
      

         }
          else { System.out.println("not a palindrome");
           

       }
    }
      
      
}



//without reversing
class Palindrome {

    public boolean palin(int x) {

        // negative numbers are not palindrome
        if (x < 0) return false;

        int div = 1;

        // find divisor to get first digit
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int first = x / div;
            int last = x % 10;

            if (first != last) {
                return false;
            }

            // remove first and last digits
            x = (x % div) / 10;
            div = div / 100;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();

        int num = 12321;
        System.out.println(obj.palin(num)); // true
    }
}

//half reverse(leeetcode)
class Solution {
    public boolean isPalindrome(int x) {

        // negative numbers & numbers ending with 0 (except 0) are NOT palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }

        // for even length: x == reversedHalf
        // for odd length: x == reversedHalf / 10
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}
