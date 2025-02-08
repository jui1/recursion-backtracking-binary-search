package BinarySearch;

public class Cilling {
    public static void main(String[] args) {

        int arr[] ={ 2, 5 , 8, 90,1234};
        int target = 90;
        System.out.println(ss(arr, target));
        
    }
    // ⌈3.2⌉ = 4

    public static int ss(int arr[] , int target){
        int start = 0 ;
        int end = arr.length-1;
        if(arr.length == 0) return -1;

        while(start<=end){
            int mid = start +(end- start) /2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                // start = mid+1;
                end = mid-1;

            }else{
                // end = mid-1;
                start = mid+1;

            }

        }
return start;
        
    }
    
}
