package recursion.quicksort;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {


    
        int[] arr ={5 , 4 ,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

private static void sort(int[] nums, int low , int hi ){

    if(low>=hi){
        return;
    }

    int s = low;
    int e = hi;
    int m = s+(e-s)/2;

    int piviot = nums[m];

    while( s<=e)
{
    while (nums[s]<nums[m]) {
        s++;
        
    }

    while (nums[e]>nums[m]) {
        e--;
        
    }


    if(s<=e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
    }
}

sort(nums, low ,  e);
sort(nums, s, hi);
}
    
}
