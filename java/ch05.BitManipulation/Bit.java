/*
0 = 000
1 = 001
2 = 010
3 = 011
4 = 100
5 = 101
6 = 110
7 = 111
8 = 1000
9 = 1001
10 = 1010

odd numbers end in 1, even numbers end in 0

AND (&)
Compares each bit of two numbers and returns 1 if both bits are 1, else returns 0.
Example: 5 & 3 → 0101 & 0011 → 0001 (Result: 1)

OR (|)
Compares each bit of two numbers and returns 1 if at least one of the bits is 1.
Example: 5 | 3 → 0101 | 0011 → 0111 (Result: 7)

XOR (^)
Compares each bit of two numbers and returns 1 if the bits are different, else returns 0.
Example: 5 ^ 3 → 0101 ^ 0011 → 0110 (Result: 6)

NOT (~)
Flips all the bits of a number (1 becomes 0, and 0 becomes 1).
Example: ~5 → ~0101 → 1010 (Result: -6 in two's complement representation)
~0 = -1

Left Shift (<<)
Shifts bits to the left by a specified number of positions, filling with 0.
a << b = a*(2**b)
Example: 5 << 1 → 0101 << 1 → 1010 (Result: 10)

Right Shift (>>)
Shifts bits to the right by a specified number of positions.
a >> b = a/(2**b)
Example: 5 >> 1 → 0101 >> 1 → 0010 (Result: 2)

a number n can be represented in max [log(n){base 2} + 1] bits
*/
public class Bit {
    // Function to check if a number is odd or even
    public static void oddOrEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    // Function to get the ith bit
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        return (n & bitmask) != 0 ? 1 : 0;
    }

    // Function to set the ith bit
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // Function to clear the ith bit
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // Function to update the ith bit
    public static int updateIthBit(int n, int i, int newValue) {
        n = clearIthBit(n, i); // Clear the ith bit first
        int bitmask = newValue << i;
        return n | bitmask; // Set the ith bit to the new value
    }

    // Function to clear the last i bits
    public static int clearLastIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    // Function to clear a range of bits
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1); // Left part (all 1's before position j)
        int b = (1 << i) - 1;   // Right part (all 1's after position i - 1)
        int bitmask = a | b;
        return n & bitmask;
    }

    // Function to check if a number is a power of 2 or not
    public static boolean powerOfTwo(int n) {
        return (n>0) && (n & (n-1)) == 0;
    }

    //Function to count set bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    
    //Fast exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
    
        while (n > 0) {
            //check if LSB is 1
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a; // Square the base
            n = n >> 1; // Right shift n by 1 (divide by 2)
        }
    
        return ans;
    }
    

    public static void main(String[] args) {
        // Examples of bitwise operations
        System.out.println(5 & 3);  // Bitwise AND
        System.out.println(5 | 3);  // Bitwise OR
        System.out.println(5 ^ 3);  // Bitwise XOR
        System.out.println(~5);     // Bitwise NOT
        System.out.println(~0);     // Bitwise NOT
        System.out.println(5 << 1); // Left shift
        System.out.println(5 >> 1); // Right shift


        oddOrEven(2);
        System.out.println("Get 2nd bit of 5: " + getIthBit(5, 2));
        System.out.println("Set 1st bit of 5: " + setIthBit(5, 1));
        System.out.println("Clear 2nd bit of 5: " + clearIthBit(5, 2));
        System.out.println("Update 1st bit of 5 to 1: " + updateIthBit(5, 1, 1));
        System.out.println("Clear last 2 bits of 15: " + clearLastIBits(15, 2));
        System.out.println("Clear bits 1 to 3 of 31: " + clearRangeOfBits(31, 1, 3));
        System.out.println("64 is a power of 2: " + powerOfTwo(64));
        System.out.println("Set bits in number 100: " + countSetBits(100));
        System.out.println("Fast exponentiation of 5^10: " + fastExpo(5, 10));
    }
}
