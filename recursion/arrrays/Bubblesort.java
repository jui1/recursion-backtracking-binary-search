package recursion.arrrays;

public class Bubblesort {
    public static void main(String[] args) {
        
    }

    private static void ans(int[] arr , int r , int c){

       if(r == 0){
        return ;
       }

       if(c<r){

        if(arr[c] < arr[c+1]){
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] =temp;
        }

        ans(arr, r, c+1);

       }else{
        ans(arr, r+1, c);
       }

       
    }
    
}
