// problem statement :
// https://www.geeksforgeeks.org/chocolate-distribution-problem/

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] choco = {3, 4, 1, 9, 56, 7, 9, 12}; //{1,3,4,7,9,9,12,56}
        int n= choco.length;
        int m =5;

        Arrays.sort(choco);

        int min=99999;
        for(int i=0;i<n-m;i++){
            if(choco[i+m-1]-choco[i]< min){
                min=choco[i+m-1]-choco[i];
            }
        }
        System.out.println("minimum Differnce is : "+ min);

    }
    
}
