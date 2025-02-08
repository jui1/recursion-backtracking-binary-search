package practice;

public class removeapp {
    public static void main(String[] args) {
        String input = "appleappbanana";
        fun(input, "");
        
    }
    public static void fun(String abb , String bb){

        if(abb.isEmpty()){
            System.out.println(bb);
            return;
        }
        
        if(abb.startsWith("app") &&  !abb.startsWith("apple") ){
            fun(abb.substring(3), bb);

        }else{
            fun(abb.substring(1), bb + abb.charAt(0));
        }
    }
    
}
