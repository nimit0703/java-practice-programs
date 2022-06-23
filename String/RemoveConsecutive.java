// problem statement:
// https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1

public class RemoveConsecutive {
    public static void main(String[] args) {
        String s = "baaccaad";
        StringBuffer str = new StringBuffer();

        char pre = s.charAt(0);
        int l =s.length();
        str.append(pre);

    
        for (int i = 1; i < l; i++) {
            char curr = s.charAt(i);
            if (curr != pre) {
                str.append(curr);
            }
            pre = curr;
        }
        System.out.println(str);

    }
    
}
