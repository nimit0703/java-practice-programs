// problem statement :
// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

class ContainsDuplicate{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,3,2,4,6,6};
        int[] arr2 = {1,2,3,5,4,6};

       System.out.println("ans: " + contain(arr1));
       System.out.println("ans: " + contain(arr2));
      
    }
    static boolean contain(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        if(arr.length == set.size()){
            return true;
        }else{
            return false;
        }

       

    }
}

    