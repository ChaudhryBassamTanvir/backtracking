import java.util.ArrayList;
import java.util.List;

public class N_queens {
    //N x N chessboard
    //N queens
    // Print all solutions where queens are safe 


public boolean isSafe(int row, int col, char[][] board){
//horizontal

for(int j=0;j<board.length;j++ ){
    if (board[row][j]=='Q') {
       return false;
        
    }
}
}



public void helper(char[][] board, List<List<String>> allBoards, int col){
if (col==board.length) {
    saveBoard(board, allBoards);
    
}

for(int row=0; row<board.length; row++){
if (isSafe(row,col,board)) {
 board[row][col]='Q';
 helper(board, allBoards, col++);
 board[row][col]='.';
    
}
}


}


    public List<List<String>> solveNQueens(int n){
       List<List<String>> allBoards = new ArrayList<>();
       char[][] board = new board[n][n];

       helper(board, allBoards, 0);

}



    public static void main(String[] args) {
 


    }
}
