package practice;
//skip apple

public class removchnaging {
    public static void main(String[] args) {
        String input = "applepie";
        fun(input, "");
        
    }
 static void fun(String ab , String result ){

    if(ab.isEmpty()){
        System.out.println(result);
        return ;
    }

   

   if(ab.startsWith("apple")){
  fun(ab.substring(5) , result  );
   }else{
  fun(ab.substring(1), result + ab.charAt(0));
   }


   
 }
}
