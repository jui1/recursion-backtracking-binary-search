package Sorting.InsertionSort;

import java.util.Arrays;

public class implement {
    public static void main(String[] args) {
      int[] arr ={3,8,21,0,8};
      swap(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;

                }else{
                    break;
                }
            }

        }
    }
    
}
