public class KeypadMapping {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};

    static void keyCombination(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }

        char curr= str.charAt(index);
        String mapping = keypad[curr-'0'];
        for(int i=0;i<mapping.length();i++){
            keyCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        keyCombination("23", 0, "");
        
    }
    
}
