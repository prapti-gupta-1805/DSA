//import java.util.*;
public class TwoDArrays {
   public static void spiral(int matrix[][]) {
      /* for a matrix:
      [1,2,3]
      [4,5,6]
      [7,8,9]
      output should be:
      1,2,3,6,9,8,7,4,5 */
      int startRow = 0;
      int startCol = 0;
      int endRow = matrix.length-1;
      int endCol = matrix[0].length-1;

      while(startRow <= endRow && startCol <= endCol) {
         //top
         for(int j=startCol; j<=endCol; j++) {
            System.out.print(matrix[startRow] [j]+" "); }
         //right
         for(int i=startRow+1; i<=endRow; i++) {
            System.out.print(matrix[i] [endCol]+" ");}
         //bottom
         for(int j=endCol-1; j>=startCol; j--) {
            System.out.print(matrix[endRow] [j]+" ");}       
         //left
         for(int i=endRow-1; i>=startRow+1; i--) {
            System.out.print(matrix[i] [startCol]+" ");}
            
         startCol++;
         startRow++;
         endCol--;
         endRow--;
      }
   }

   public static void diagonalSum(int matrix[][]) {
      //for square matrix only
      int sum = 0;
      for(int i=0; i<matrix.length; i++) {
      //pd
      sum+= matrix [i] [i];
      //sd
      if(i!= matrix. length-1-i)
      sum+= matrix[i] [matrix. length-i-1];
      }
      System.out.println("Diagonal sum:  " + sum);
   }
   
   public static boolean staircaseSearch(int matrix[][], int key) {
      int row = 0, col = matrix[0].length-1;
      while(row< matrix. length && col >= 0) {
         if(matrix[row][col]== key) {
            System.out.println("found key at (" + row + "," + col +")"); return true;
         }
         else if (key<matrix[row][col]) {
            col--;
         }
         else {
            row++;
         }
      }
      System.out.println("key not found!");
      return false;
   }
   public static void main(String[] args) {
      // //creation
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter number of rows: ");
      // int r = sc.nextInt();

      // System.out.print("Enter number of columns: ");
      // int c = sc.nextInt();

      // int matrix[][] = new int[r][c];

      // //input
      // for (int i=0; i<r;i++) {
      //    for (int j=0; j<c; j++) {
      //       System.out.print("Enter element: ");
      //       matrix[i][j] = sc.nextInt();
      //    }
      // }
      // //output
      // for (int i=0; i<r;i++) {
      //    for (int j=0; j<c; j++) {
      //       System.out.print(matrix[i][j] + " ");
      //    }
      //    System.out.println();
      // } 
      // sc.close();

      int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
      int key = 39;
      spiral(matrix);
      System.out.println();
      diagonalSum(matrix);
      staircaseSearch(matrix, key);
   }
}