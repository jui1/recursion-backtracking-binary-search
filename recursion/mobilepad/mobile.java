package recursion.mobilepad;

import java.util.ArrayList;

public class mobile {
    public static void main(String[] args) {
        ArrayList<String> combinations = fun("", "12");
        System.out.println(combinations);
    }
    static ArrayList<String> fun(String uo, String up) {
        
        if(up.isEmpty()){
            ArrayList<String> result = new ArrayList<>();
            result.add(uo);
            return result;
        }

        int ch = up.charAt(0) -'0';

        ArrayList<String> result = new ArrayList<>();

        for(int i = (ch-1) * 3 ;i< ch*3  ;i++){
            char h = (char)('a'+i);
          result.addAll( fun(uo +h, up.substring(1))) ;
        }

        return result;


    }
    
}
