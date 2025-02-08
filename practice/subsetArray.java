package practice;

import java.util.ArrayList;

public class subsetArray {
    public static void main(String[] args) {
        ArrayList<String> result = fun("abc", "");
        System.out.println(result); 
        
    }

    static ArrayList<String> fun(String ans , String res){

        ArrayList<String> arr = new ArrayList<String>();

        if(ans.isEmpty()){
           arr.add(res);
           return arr;


        }

        char at = ans.charAt(0);

        ArrayList<String> left =    fun(ans.substring(1), res);
        ArrayList<String> left3 =    fun(ans.substring(1), res+at);

        arr.addAll(left);
        arr.addAll(left3);

        return arr;


    }
    
}
