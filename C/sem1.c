#include <stdio.h> //prepocessor directive
#include <string.h>

//Functions 
    //function definition
void printHello() {
    printf("Hello!\n");
}

int sum(int a,int b){
    return a+b;
}
    //recursive funtion
void PrintHello(int a) {
    //base case
    if(a==0) {
        return;
    }
    //work to be done
    printf("Hello word\n");
    PrintHello(a-1);
}

void square(int* ptr) {
    *ptr = (*ptr) * (*ptr);
    printf("%d\n",*ptr);
}

void printArray(int Marks[], int n) {
    printf("Entered marks:\n");
    for (int k = 0; k < n; k++) {
        printf("marks[%d] = %d\n", k, Marks[k]);
    }
}

int main() {
//output
    printf("hello world!\n");
    int Age = 22;
    printf("age is %d \n", Age);
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
    int n = -2;
    if(n>0) {
        printf("Number is positive\n");
        if(n%2==0) {
            printf("Even \n");
        } else {
            printf("odd \n");
        }
    } else if(n==0) {
        printf("Number is 0\n");
    } else {
        printf("Number is negative\n");
    }

    //ternary operator
    //Condition ? doThis if True : doThis if False;
    int marks = 40;
    marks<=33 ? printf("FAIL\n") : printf("PASS\n");

    //Switch
        //nested switch is allowed
    int day = 4;
    switch(day) {
        case 1: printf("Monday\n");
                break;
        case 2: printf("Tuesday\n");
                break;
        case 3: printf("Wednesday\n");
                break;
        case 4: printf("Thursday\n");
                break;
        case 5: printf("Friday\n");
                break;
        case 6: printf("Saturday\n");
                break;
        case 7: printf("Sunday\n");
                break;
        default:printf("Invalid\n");
    }

//Loop control
    //for loop
    for(int i=0; i<=3;i++){
        printf("%d\n",i);
    }

        //i++ use then increase
        //++i increase then use

    //while loop
    int i=1;
    while(i<=3) {
        printf("%d %d\n",i,i);
        i++;
    }

    //do while loop
    int j=1;
    do {printf("%d %d %d\n",j,j,j);
        j++;} while(j<=3);

//loop control statement
    //break -> exit loop
    //continue -> skip to next iteration

    //function call
    printHello();
        printf("Sum = %d\n", sum(num1,num2));

    //value passed in function call is called argument or actual parameter. used to send value
    //value passed in function declaration and definition is called formal parameter. used to recieve value


//recursion
    PrintHello(3);

//pointer - variable that stores the memory address of another variable
    int age = 22;
    int *ptr = &age; //* - value at address; & - address of
    printf("%p\n",&age);
    printf("%u\n",&age);
    ptr++;
    printf("%u\n",ptr); //ptr increases by 4 bytes
    ptr--;

    //pointer to pointer
    int **pptr = &ptr;

    //call by value - pass value of variable as argument
    //call by reference - pass address of variable as argument


    square(ptr); //call by reference

//Array
    //collection of similar data types stored at contiguous memory locations
    int Marks[3]; //syntax 1
    //int Marks[] = {98,99,100}; //syntax 2
    //int Marks[3] = {98,99,100}; //syntax 3
    //memory reserved = size*size of 1 data
    for (int k = 0; k < 3; k++) {
        printf("Enter marks[%d]: ", k);
        scanf("%d", &Marks[k]);
    }

    printf("Entered marks:\n");
    for (int k = 0; k < 3; k++) {
        printf("marks[%d] = %d\n", k, Marks[k]);
    }

    //int *arr = &Marks[0];
    int *arr = Marks;

    //array as func arguments
    printArray(Marks,3);

    //multidimential arrays
    int Arr[2][2] = {{1,2},{3,4}};

    for (int i=0;i<2;i++) {
        for (int j=0;j<2;j++) {
            printf("Arr[%d][%d] = %d\n", i,j,Arr[i][j]);
        }
    }

//string
    //character array terminated by \0
    //size taken by string = number of characters + 1
    char name[] = {'P','R','A','P','T','I','\0'};
    char Name[] = "PANKAJ";
    char NAME[50];
    scanf("%s",&NAME); //cannot input multi word strings with spaces

    int ch=0;
    while(Name[ch]!='\0') {
        printf("%c\n",Name[ch]);
        ch++;
    }

    printf("%s\n",name);
    

    char str[50];
    gets(str); //replacement for scanf but outdated
    puts(str); //replacement for printf

    char STR[50];
    fgets(str,10,stdin);
    fputs(str,stdout);

    //string defined by *str notation is mutable
    //string defined by str[] notation is immutable

    int length = strlen(name);
    printf("%d",length);

    char str1[]="Hello";
    char str2[]="World";
    strcpy(str1,str2);
    puts(str2);

    strcat(str1,str2);
    puts(str1);

    int A = strcmp(str1,str2); //returns 0 for equal, +ive for 1>2, -ive for 2>1
    printf("%d",A);
    return 0;
} 