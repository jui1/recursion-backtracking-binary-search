package recursion;
//5 , 4, 3,2,1

public class ntooneprint {
    public static void main(String[] args) {
        
        printkk(5);
        
    }

    private static void printkk(int n){

        if(n==0){
            return ;
        }
        System.out.println(n);
        printkk(n-1);
       
       
       
       

    }
    
}
