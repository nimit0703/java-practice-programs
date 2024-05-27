public class ValidPalindrom {
    public static void main(String[] args) {
        // System.out.println("hello");
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
        
        System.out.println(sol.isPalindrome("ab_a"));
        
        
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        s = s.toLowerCase();
        s = s.replaceAll("[\\W_]", "");
        System.out.println(s);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1) ) return false;
        }
        return true;
    }
}