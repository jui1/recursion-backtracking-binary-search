package backtraking;

public class Nqueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        ans(board, 0);
        
    }
    public static int ans(boolean[][] board , int row){
        if(row==board.length){
            display(board);
            return 1;


        }
int count = 0;
        //placling the queen 
        for(int col = 0 ; col<board.length;col++){
if(isSafe(board,row,col)){
    board[row][col] = true;
    count+=ans(board, row+1);
    board[row][col] = false;
}
        }




        return count;

    }
    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean ement : row){
                if(ement){
                    System.out.print("Q ");
                }
                System.out.print("Z ");
            }

            
System.out.println();
        }

         System.out.println();
    }


    private static boolean isSafe(boolean[][] board , int row , int col){
       for(int i =0 ;i<row;i++){
        if(board[i][col]){
return false;
        }
       } 

int left = Math.min(row, col);
       for(int i =1 ;i<=left;i++){
        if(board[row-i][col-i]){
return false;
        }
       } 


       
int right = Math.min(row, board.length-col-1);
for(int i =1 ;i<=right;i++){
 if(board[row-i][col+i]){
return false;
 }
}
return true;

    }

 


    
}
