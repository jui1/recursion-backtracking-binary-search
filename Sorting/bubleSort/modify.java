package Sorting.bubleSort;

import java.util.Arrays;

public class modify {
    public static void main(String[] args) {
        int[]arr ={9,0,8,6,1};

        swap(arr);

        System.out.println(Arrays.toString(arr));
        
    } 

    static void  swap(int[] arr){
     for(int i = 0;i<arr.length;i++){
        boolean swaped = false;

        for(int j =1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
                swaped = true;

            }
        }

        if(!swaped) break;
     }

    }
}
