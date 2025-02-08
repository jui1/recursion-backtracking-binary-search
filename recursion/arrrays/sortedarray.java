package recursion.arrrays;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println(sorted(arr , 0));

        
    }

    private static boolean sorted(int[] arr , int index){

        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1] && sorted( arr , index+1));
    
    }
    
}
