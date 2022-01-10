public class ReverseArr {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int temp[] =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
        arr=temp;
        for(int i:arr){  
            System.out.println(i);  
            }
        // System.out.println(arr[]);
    }
    
}
