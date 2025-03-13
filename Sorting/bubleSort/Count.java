package Sorting.bubleSort;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr = {6, 90, 56, 12, 0};

        // Count swaps and sort the array
        int swapCount = swap(arr);
        
        // Print the sorted array and the number of swaps
        System.out.println(Arrays.toString(arr));
        System.out.println("Total Swaps: " + swapCount);
        
    }
   private static int swap(int[] arr){
      int count =0;
      
    for(int i = 0;i<arr.length;i++){
        boolean swaped = false;
        for(int j  = 1; j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
               
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                count++;
                swaped= true;
                

            }
        }

        if (!swaped) {
        break;
            
        }
    }

    return count;
   }
    
}
