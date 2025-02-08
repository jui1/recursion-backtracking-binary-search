package backtraking;

public class printpath {
    public static void main(String[] args) {
      fun("", 3, 3);
        
       
    }
    private static void fun( String  ab, int  row , int col){

        if(row == 1 || col ==1){
            System.out.println(ab);
            return ;
        }
if(row>1){
    fun( ab+"R", row-1, col);
}
if(col>1){
    fun(ab+"D", row, col-1);
}

if(row>1 && col>1){
    fun(ab+"p", row-1, col-1);
}
        
      

    }
    
}
