public class palindromeRecursion {
    public static  boolean isPalindrome(String s, int left, int right){
       
       if(left>=right){
        return true;
       }
       if(s.charAt(right)!=s.charAt(left)){
        return false;
       }
       return isPalindrome(s, left+1, right-1);
      


    }
    public static void main(String[] args) {
        String s="MADAM";
        s=s.toLowerCase();
        
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
    
}
