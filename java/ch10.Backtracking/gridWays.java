public class gridWays {
    
    public static int GridWays(int i, int j, int n, int m) {
        //Base case
        if (i == n-1 && j == m-1) {
            return 1;
        }
        //Corner case
        if (i >= n || j >= m) {
            return 0;
        }
    
        int w1 = GridWays(i + 1, j, n, m);
        int w2 = GridWays(i, j + 1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args) {
        System.out.println(GridWays(0, 0, 3, 3));
    }
}
