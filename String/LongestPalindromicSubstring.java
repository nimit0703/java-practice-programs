// problem :
// https://leetcode.com/problems/longest-palindromic-substring/


public class LongestPalindromicSubstring {
    public static void main(String[] args) {
       String s="babadabab";
       int n= s.length();
       String result="";
       for(int i=0;i<n;i++){
        for(int j=i;j<=n;j++){

            String newS=s.substring(i, j);
            if(palindrom(newS, newS.length())){
                if(newS.length() >result.length()){
                    result=newS;
                }

            }
        }
       }
       System.out.println(result);
      
      

       

    }

    static boolean palindrom(String str,int n){
    
        int c=0;
        if(str.length()==1  || str.length()==0){
            return true;
        }
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)== str.charAt(n-i-1)){
                c++;
            }else{
                return false;
            }
     
            
        }
        if(c>0){
           return true;
        }
        return false;
    }
    
}
