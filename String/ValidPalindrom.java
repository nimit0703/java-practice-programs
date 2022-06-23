public class ValidPalindrom {
    static void palindrom(String str){
        str=str.replace(" ", "");
        str=str.replace(",", "");
        str=str.replace(":", "");
        str=str.replace(";", "");
        str=str.replace(".", "");
        str=str.toLowerCase();
        int n= str.length();
        int c=0;
        System.out.println("converted str : "+str);
        if(str.length()==1  || str.length()==0){
            System.out.println("yes");
        }
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)== str.charAt(n-i-1)){
                c++;
            }else{
                System.out.println("No");
                break;
            }
     
            
        }
        if(c>0){
            System.out.println("yes");
        }
        
    }

    public static void main(String[] args) {
        String s = " ";
        palindrom(s);
        
        
    }
}
