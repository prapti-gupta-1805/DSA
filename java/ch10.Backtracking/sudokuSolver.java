public class sudokuSolver {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        //col
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        //row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        //grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (sudoku[startRow + i][startCol + k] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solveSudoku(int[][] sudoku, int row, int col) {
        //base
        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false; //no soln
    }

    public static void printSudoku(int[][] sudoku) {
        System.out.println("Sudoku Board:");
        for (int i = 0; i < 9; i++) {
            //horizontal line
            if (i % 3 == 0 && i != 0) {
                System.out.println("----------------------");
            }
        for (int j = 0; j < 9; j++) {
            //vertical line
            if (j % 3 == 0 && j != 0) {
                System.out.print("| ");
            }
            System.out.print(sudoku[i][j] + " ");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        // int[][] sudoku = {
        //     {9, 1, 3, 0, 0, 0, 5, 0, 0},
        //     {6, 0, 7, 0, 0, 0, 0, 2, 4},
        //     {0, 5, 0, 0, 8, 0, 0, 7, 0},
        //     {0, 7, 9, 0, 0, 0, 0, 0, 0},
        //     {0, 0, 2, 0, 9, 0, 0, 4, 3},
        //     {0, 0, 0, 0, 0, 4, 0, 9, 0},
        //     {0, 4, 0, 0, 0, 1, 9, 0, 0},
        //     {7, 0, 6, 0, 0, 9, 0, 0, 5},
        //     {0, 0, 1, 0, 0, 6, 4, 0, 7},
        // };

        if (solveSudoku(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
