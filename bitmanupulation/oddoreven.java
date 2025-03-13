package bitmanupulation;

public class oddoreven {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(oddoreven(n));
        
    }
    public static boolean oddoreven(int num){
        return ((num&1)==1);
    }
    
}
