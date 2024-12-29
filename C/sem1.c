//prepocessor directive
#include <stdio.h> 
#include <math.h>

int main() {
//output
    printf("hello world!\n");
    int age = 22;
    printf("age is %d \n", age);
    //%d - int
    //%f - float
    //%c - char
//input
    int num1,num2;
    printf("Enter two numbers:  ");
    scanf("%d",&num1);
    scanf("%d",&num2);
    printf("sum = %d \n", num1 + num2);
    
//type conversion
    int a = (int) 1.999;
    printf("%d \n", a);

    int x = 4*3/6*2;
    printf("%d \n", x);

/*  arithmetic operators: +,-,/,*,%
    relational: <,>,<=,>=,==,!=
    logical: &&,||,!
    bitwise
    asignment: =,+=,-=,*=,%=
    ternary
    
    operator precedence:
    !
    *,/,%
    +,-
    <,>,<=,>=
    ==,!=
    &&
    ||
    =
    
    for same precedence go left to right */

//conditional statements
    //if-else
    int n = 2;
    if(n<0) {
        printf("Number is negative\n");
    }
    else if(n==0) {
        printf("Number is 0\n");
    }
    else {
        printf("Number is positive\n");
    }

    //ternary operator
    //Condition ? doThis if True : doThis if False;
    n%2==0 ? printf("Even\n") : printf("Odd\n");

    //Switch
    
    return 0;
}