package recursion;

//2 × 3 × 4 = 24

public class productofdigt {
    public static void main(String[] args) {
        System.out.println(ans(8089));
        
    }
    private static int ans(int n){
      if(n%10 ==n){
        return n;
      }

    
        return (n % 10) * ans(n / 10);
    }
    
}
