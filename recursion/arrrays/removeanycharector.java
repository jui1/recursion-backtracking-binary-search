package recursion.arrrays;

public class removeanycharector {
    public static void main(String[] args) {
        String sentence = "hello world";
        char charToRemove = 'o';
        fun(sentence, charToRemove, 0 , "");
        
    }
    static void fun(String sen , char ab , int index , String result){
        if(index == sen.length()){
            System.out.println(result);
            return ;
        }

    char ch = sen.charAt(index);

    if(ab == ch ){
        fun(sen, ab, index+1 , result);

    }else{
        fun(sen, ab, index+1 ,result+ch);
    }
    } 
    
}
