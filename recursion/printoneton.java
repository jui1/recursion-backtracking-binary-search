package recursion;

public class printoneton {
    public static void main(String[] args) {
        printk(7);
        
    }

    private static void printk(int n){
        if(n==0){
            return ;
        }

        printk(n-1);

        System.out.println(n);

    }
    
}
