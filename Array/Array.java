import java.util.*;
public class Array {
    static void getMaxMin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max: "+ max );
        System.out.println("min: "+ min );
    }
    static void sort(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    static void getKthMaxMin(int arr[],int k){
        sort(arr);
        System.out.println("Min : "+ arr[k-1]);
        System.out.println("Max : "+arr[arr.length-k]);
    }








    public static void main(String[] args) {
        int arr[] ={1,4,3,-9,0,17};  //array with ints//
        // getMaxMin(arr);
        // sort(arr);
        // getKthMaxMin(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    
}
