package practice;

public class printascillvalue {
    public static void main(String[] args) {
      
       System.out.println("sum" + " " + fun("abc", "") );
        
    }

    public static int fun(String ab , String em ){
        if(ab.isEmpty()){
            System.out.println(em);
            return  1;
        }
        

        int at = ab.charAt(0) -'0';

     int left =    fun(ab.substring(1), em+at );
     int right =    fun(ab.substring(1), em);

      return left+right; 
        
    }
    
}
