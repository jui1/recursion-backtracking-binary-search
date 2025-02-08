package recursion.mobilepad;

public class mobilepad {
    //digits = "23"
    // ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    public static void main(String[] args) {
        fun("", "12");
        
    }

    static void fun(String p , String aa ){

        if(aa.isEmpty()){
            System.out.println(p);
            return ; 
        }

      int ch = aa.charAt(0) - '0' ;

      for( int  i = (ch-1)*3 ;i< (ch)*3;i++){
        char pp =  (char) ('a'+ i);
        fun(p+pp, aa.substring(1));


      }

    }
    
}
