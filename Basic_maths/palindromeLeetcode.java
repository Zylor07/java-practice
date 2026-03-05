public class palindromeLeetcode {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Use append() for StringBuilder
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        String result = cleaned.toString();
        return check(0, result.length() - 1, result);
    }

    private boolean check(int left, int right, String s) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(left + 1, right - 1, s);
    }
    public static void main(String[] args) {
        palindromeLeetcode obj=new palindromeLeetcode();
        System.out.println(obj.isPalindrome("MADAM"));
        
    }
    
}
