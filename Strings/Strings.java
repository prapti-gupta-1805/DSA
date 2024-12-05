package Strings;

import java.util.*;

//IMMUTABLE data type
public class Strings {
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
        }
    }