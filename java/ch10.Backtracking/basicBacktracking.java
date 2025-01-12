public class Backtracking {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // Function call
        arr[i] -= 2; // Backtracking step
    }

    public static void findSubsets(String str, String s, int i) {
        // Base case
        if (i == str.length()) {
            if (s.length() == 0) {
                System.out.println(".");
            } else {
                System.out.println(s);
            }
            return;
        }
        // Recursion
        // Yes choice
        findSubsets(str, s + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, s, i + 1);
    }

    public static void findPermutation(String str, String s) {
        // Base case
        if (str.length() == 0) {
            System.out.println(s);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, s + curr);
        }
    }

    //time complexity: O(n!)
    public static void nQueens(char board[][], int row) {
        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nQueens(board,row+1);
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

    public static int gridWays(int i, int j, int n, int m) {
        //Base case
        if (i == n-1 && j == m-1) {
            return 1;
        }
        //Corner case
        if (i >= n || j >= m) {
            return 0;
        }
    
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String args[]) {

        int arr[] = new int[5];
        // Simple depiction of backtracking
        changeArr(arr, 0, 1);
        printArr(arr);

        String str = "abc";
        System.out.println("Subsets of \"" + str + "\":");
        findSubsets(str, "", 0);

        System.out.println("Permutations of \"" + str + "\":");
        findPermutation(str, "");
    
        int n = 4;
        char board[][] = new char[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board,0);

        System.out.println(gridWays(0, 0, 3, 3));
    }
}
