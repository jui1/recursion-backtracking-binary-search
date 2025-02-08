package recursion;

public class sumofdights {
    public static void main(String[] args) {
        System.out.println(ans(1234));

        
    }
    private static int ans(int n){
        if(n == 1){
            return 1;
        }

        return (n % 10) + ans(n / 10);
        
    }
    
}
