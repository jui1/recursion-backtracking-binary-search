package practice;

public class permutation {
    public static void main(String[] args) {
        fun("abc", "");
        
    }
    
    static void fun(String ab , String em){
        if(ab.isEmpty()){
            System.out.println(em);
            return ;
        }

        char at = ab.charAt(0);

        for(int i = 0 ;i<=em.length();i++){
            String start =em.substring(0,i);
            String end = em.substring(i  );

            fun(ab.substring(1) ,start+at+end);


        }

    }
}
