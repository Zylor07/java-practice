class palindromeString{
    public boolean isPalindrome(String s) {
        // Handle edge cases like empty strings
        if (s == null) return false;
        
        // Use a helper to track the pointers
        return check(0, s.length() - 1, s);
    }

    private boolean check(int left, int right, String s) {
        // Base Case: Pointers have met or crossed
        if (left >= right) {
            return true;
        }

        // Logical Check: If characters at ends don't match
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive Step: Shrink the window
        return check(left + 1, right - 1, s);
    }
    public static void main(String[] args) {
        palindromeString obj=new palindromeString();
        System.out.println(obj.isPalindrome("MADAM"));
    }
}