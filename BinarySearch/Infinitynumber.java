package BinarySearch;

public class Infinitynumber {
    public static void main(String[] args) {
        int arr[] = {12,23,45,67,89,123,345,678};
        int target = 123;

        System.out.println(ans(arr, target));
        
    }

    static int ans(int arr[] , int target ){
        int start = 0;
        int end = 1;

        if(target> arr[end]){
   int starts = end+1;
    end = end + (end- start +1)*2;

    start = starts;
        }
        return ss(arr, target, start, end);
    }

    public static int ss(int arr[] , int target , int start , int end){
        
        

        while(start<=end){
            int mid = start +(end- start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }

        }

        return -1;
    }
    
}
