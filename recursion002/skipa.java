package recursion002;

public class skipa {
    public static void main(String[] args) {
        func("", "aaabd", 'a');
        
    }
    private static void func(String epmty , String value , char a){
        if(value.isEmpty()){
            System.out.println(epmty);
            return;
        }

        char ch = value.charAt(0);

        if(ch != a){
            func( epmty+ch ,  value.substring(1) , a);
        }else{
            func( epmty ,  value.substring(1) , a);
        }


    }
    
}
