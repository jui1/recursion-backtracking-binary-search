package practice;

public class subset {
    public static void main(String[] args) {
        fun("yyyyyufwr", "");
        
    }
    static void fun(String ans, String empty){

        if(ans.isEmpty()){
            System.out.println(empty);
            return ;
        }

        char at = ans.charAt(0);

        fun(ans.substring(1), empty);
        fun(ans.substring(1), empty+at);


    }
}
