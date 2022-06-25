public class TowerOfHanoi {

    static void toh(int n,String source,String helper,String Destination){
        if(n==1){
            System.out.println(n+ " is transfered from "+source+" to "+Destination);
            return;
        }

        toh(n-1,source,Destination,helper);
        System.out.println(n+ " is transfered from "+source+" to "+Destination);
        toh(n-1,helper,source,Destination);
    }
    public static void main(String[] args) {
        toh(3,"source","helper","destinataion");
    }
    
}
