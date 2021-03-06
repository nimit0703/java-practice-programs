// problem statment : 
// https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/


public class SortedAndPivotedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 3;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
        
    }

    private static int search(int[] arr, int l, int h, int key) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(key == arr[mid]){
            return mid;
        }

        if (arr[l] <= arr[mid]) {
     
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
        
            return search(arr, mid + 1, h, key);
        }
 
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
 
        return search(arr, l, mid - 1, key);

    }
    
}
