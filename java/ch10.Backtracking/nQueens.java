public class nQueens {
    
    //time complexity: O(n!)
    public static void NQueens(char board[][], int row) {
        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            NQueens(board,row+1);
            board[row][j] = 'x'; //backtracking step
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        int i,j;
        for(i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        for(i=row-1,j=col-1; i>=0 && j>=0;i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        for (i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------------");
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        NQueens(board,0);

    }
}
