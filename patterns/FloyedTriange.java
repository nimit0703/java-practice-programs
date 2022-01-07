public class FloyedTriange {
    public static void main(String[] args) {
        int n=6;
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+ c + " " );
                c+=1;
            }
            System.out.println();
        }
    }
    
}
