package backtraking;

public class mazeproblem {
    public static void main(String[] args) {
        // System.out.pritln(fun(7, 7));

        System.out.println(fun(7,7));
        
    }
    private static int fun(int row , int col){
        if(row ==1 || col==1){
            return 1;
        }
        int left = fun(row-1, col);
        int right = fun(row, col-1);

        return left+right;

    }
    
}
