package practice;

import java.util.ArrayList;

public class printArrayList {
    public static void main(String[] args) {
        ArrayList<String> result = fun("abc", "");
        System.out.println(result); 
    }
    static ArrayList<String> fun(String ab , String em){
        ArrayList<String> arr = new ArrayList<String>();

        if(ab.isEmpty()){
           arr.add(em);
           return arr;
        }

        int yep = ab.charAt(0) - '0';
        ArrayList<String> left = fun(ab.substring(1), em);
        ArrayList<String> right = fun(ab.substring(1), em+yep);
       
        arr.addAll(left);
        arr.addAll(right);

        return arr;



    }
    
}
