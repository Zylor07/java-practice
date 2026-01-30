public class reverseAnumber {
    
    public int reverse(int x) {
         
        int rev = 0;
        boolean isNegative = x < 0;

        if (isNegative) {
            x = -x; // make it positive
        }

        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }

        return isNegative ? -rev : rev;
    
        
    }
    public static void main(String[] args) {
         reverseAnumber obj = new reverseAnumber();

        System.out.println(obj.reverse(12345));   // 54321
        System.out.println(obj.reverse(-12345));
        
    }
}

