package practice;

import java.util.ArrayList;

public class permutatinAraylist {
    public static void main(String[] args) {
        System.out.println(fun("abc", ""));
        
    }
    static ArrayList<String> fun(String ab , String bb){
        ArrayList<String> arr = new ArrayList<String>();

        if(ab.isEmpty()){
            arr.add(bb);
            return arr;
        }
        char a = ab.charAt(0);

        for(int i = 0 ; i<=bb.length(); i++){
            String start = bb.substring(0, i);
            String end = bb.substring(i );
            ArrayList<String> arr2 = fun(ab.substring(1), start+a+end);


            arr.addAll(arr2);

          


        }
        return arr;

    }
    
}
