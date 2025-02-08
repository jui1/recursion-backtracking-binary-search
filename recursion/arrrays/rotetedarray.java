package recursion.arrrays;

public class rotetedarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = ans(arr, target, 0, arr.length - 1);
        System.out.println(result); 
        
    }

    private static int ans(int[] arr , int target, int s, int e ){
        if(s>e){
            return -1;
        }

        int mid = s +(e- s)/2;

        if(arr[mid]== target){
            return mid;
        }

        if(arr[s] <=arr[mid]){
            if(target >= arr[s] && target<= arr[mid]){
                // e = mid-1;
              return   ans( arr , target,s, mid-1 );
            }else{
                // s = mid+1;
                return ans(arr, target, mid+1, e);
            }
        }

        if(target >=arr[mid] && target <arr[e]){
            return ans(arr, target, mid+1, e);
        }else{
            return   ans( arr , target,s, mid-1 );
        }
    }
    
}
