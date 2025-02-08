package recursion.arrrays;

public class linnerasearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 90, 17, 19};
        System.out.println(ans(arr, 15, 0));
    }

    private static boolean ans(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }


        return arr[index] == target || ans(arr, target, index+1) ;
    }
    
}
