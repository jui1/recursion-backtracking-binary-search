package recursion.subset;
//subset

public class skipa {
    public static void main(String[] args) {



       func( "" , "abc");
        
    }

    static  void func(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        func(p+ch, up.substring(1));
        func(p, up.substring(1));
    }
    
}
