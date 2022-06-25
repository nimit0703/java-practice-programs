public class IfElseTernary {
    public static void main(String[] args){
        int year = 2001;
        String output =(( year % 4 == 0) && (year % 100 !=0))?"leap year":"non leap year";
        System.out.println(output);

    }
    
}
