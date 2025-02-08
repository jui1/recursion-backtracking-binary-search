package recursion.arrrays;

import java.util.ArrayList;
import java.util.List;

public class returnarraylist {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        ArrayList<Integer> ans = new ArrayList<>(); 
        List<Integer> result = ans(arr, target, 0, ans); 
        System.out.println(result); 
        
    }

    private static List<Integer> ans(int[] arr , int target , int index , ArrayList<Integer> ans){

        if(index == arr.length){
            return ans;
        }
        if(arr[index] == target){
            ans.add(index);
        }

        return ans(arr, target, index+1, ans);

    }
}
