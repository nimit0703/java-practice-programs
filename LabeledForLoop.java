public class LabeledForLoop {
    public static void main(String[] args){
        int closing = 12;
        aa:
            for(int i =1;i<=closing;i++){
               
                for(int j=closing;j>=i;j--){
                    System.out.print("*");
                    if(i == 7 && j == 9){
                        break aa;
                    }
                }
                System.out.println();
        }
    } 
}
/*bb*/