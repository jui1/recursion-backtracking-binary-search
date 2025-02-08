package practice;

public class removechar {
    public static void main(String[] args) {
        String sentence = "hello world";
        char charToRemove = 'o';

        fun(sentence, charToRemove, 0, "");
        
    }
    static void fun(String sb , char c , int index, String result){

        if(index == sb.length()){
            System.out.println(result);
            return;

        }

        char at = sb.charAt(index);

        if(c == at){
            fun(sb, c, index+1, result);
        }else{
            fun(sb, c, index+1, result +at);

        }

    }
    
}
