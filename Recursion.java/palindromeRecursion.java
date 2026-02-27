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


// Using strings to array method and check the index of arrays at opposite position are same or not

/*   import java.util.Scanner;

public class palindromeRecursion {
    public static boolean isPalindrome(char[] arr, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (arr[left] != arr[right]) {
            return false;
        }
        return isPalindrome(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        
        char[] charArray = s.toCharArray();

        System.out.println("Is Palindrome: " + isPalindrome(charArray, 0, charArray.length - 1));
        
        sc.close();
    }
}
 */