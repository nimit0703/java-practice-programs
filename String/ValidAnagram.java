public class ValidAnagram {
    public static void main(String[] args) {
        // System.out.println("hello");
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram"));
        System.out.println(s.isAnagram("rat", "car"));
        System.out.println(s.isAnagram("aacc", "ccac"));
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}
