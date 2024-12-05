package Strings;

//IMMUTABLE data type
public class Strings {
    //given a route containing 4 directions (E,W, N, S), find the shortest path to reach destination
    public static double shortestRoute(String path) {
        int x=0;
        int y=0;
        for (int i=0; i<path.length();i++) {
            char dir = path.charAt(i);
            if(dir == 'N') {
                x++;
            }
            if (dir == 'S') {
                x--;
            }
            if (dir == 'E') {
                y++;
            }
            if (dir == 'W') {
                y--;
            }
            else {
                continue;
            }
        }
        double shortest = Math.sqrt(x*x + y*y);
        return shortest;
    }

    //palindrome checker
    public static void isPalindrome(String String) {

        int n = String.length();
        boolean isPalindrome = true;
        
        for (int i = 0; i < n / 2; i++) {
            if (String.charAt(i) != String.charAt(n - 1 - i)) {
                System.out.println("Not a palindrome");
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome == true) {
            System.out.println("Palindrome");
        }

    }
    public static void main(String[] args) {
        // String str1 = "abcd";
        // String str2 = new String("abcd");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.println(name);
        // //sc.next() takes only one word

        // name = sc.nextLine();
        // System.out.println(name);
        // //sc.nextLine() takes a full line.

        //string concatenation
        String firstName = "Prapti";
        String lastName = "Gupta";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //string length function
        System.out.println(fullName.length());

        //.charAt() - prints character at inputted index
        System.out.println(fullName.charAt(1));

        String pal = "racecar";
        isPalindrome(pal);

        String path = "WNEENESENNN";
        System.out.println(shortestRoute(path));

        //string.equals(string) for compasison of strings (don't use ==)
        String s1 = "Tony";
        String s2 = "Tony";
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        
        }
    }