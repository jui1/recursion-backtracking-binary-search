package Sorting.bubleSort;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 5, 3};
        buble(arr);
        
        // Use Arrays.toString to print the array in a readable format
        System.out.println(Arrays.toString(arr));


        
    }

  private  static void buble(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            boolean swaped = false;
            for(int j = 1 ; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                   int temp = arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j ] = temp;
                   swaped = true;
                }

            }


            if(!swaped) break;
        }
    }
    
}
