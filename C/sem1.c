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

void fibonacci_iterative(int n) {
    int a = 0, b = 1, next;
    printf("Fibonacci Series (Iterative): ");
    for (int i = 0; i < n; i++) {
        printf("%d ", a);
        next = a + b;
        a = b;
        b = next;
    }
    printf("\n");
}

void fibonacci_recursive(int end) {
    int a = 0, b = 1, count = 0;
    if (count >= end) {
        return; // Base case: stop when the desired number of terms is reached
    }
    printf("%d ", a);
    int next = a + b;
    a = b;
    b = next;
    count++;
    fibonacci_recursive(end); // Recursive call
}

int factorial_recursive(int n) {
    if (n <= 1) {
        return 1; // Base case: factorial of 0 or 1 is 1
    }
    return n * factorial_recursive(n - 1); // Recursive call
}

int factorial_iterative(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i; // Multiply result with current number
    }
    return result;
}

int main(int argc, char const *argv[]) {
//output
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

/*
Operators:
    arithmetic (+, -, *, /, %), relational (<, >, <=, >=, ==, !=), logical (&&, ||, !), assignment (=, +=, -=, *=, %=), bitwise, and conditional operators.

    Operator precedence:
    ! > *, /, % > +, - > <, >, <=, >= > ==, != > && > || > =
    
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

    //break -> exit loop
    //continue -> skip to next iteration
    
    //goto
        int n = -1;
    if(n<0) {
        goto label1;
    } else if (n==0) {
        goto label2;
    } else {
        goto label3;
    }
    
    label1:
        printf("negative");
        return 0;
    label2:
        printf("zero");
        return 0;
    label3:
        printf("positive");
        return 0;

//Functions
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

    //library functions
    int length = strlen(name);
    printf("%d",length);

    char str1[]="Hello";
    char str2[]="World";
    strcpy(str1,str2);
    puts(str2);

    strcat(str1,str2);
    puts(str1);

    int A = strcmp(str1,str2);
    //returns 0 for equal, +ive for 1>2, -ive for 2>1
    printf("%d",A);
    
//Structures
    struct student {
        char name[100];
        int roll;
        float cgpa;
    };

    struct student s1;
    s1.roll = 502;
    s1.cgpa = 9.0;
    //s1.name = "Prapti"; not correct way
    strcpy(s1.name,"Prapti");

    printf("%s %d %f", s1.name, s1.roll,s1.cgpa);

    struct student s2 = {"Anshika",22,8.5};

    //Array of structures
    struct student IT[1];
    strcpy(IT[0].name,"Rudra");

    //pointer to structure
    struct student *sptr = &s1;
    printf("strudent roll = %d\n", (*sptr).roll);
    printf("strudent roll = %d\n", sptr->roll);

    //typedef keyword
    typedef struct ComputerEngineeringStudent {
        int roll;
    } coe;

    coe s1;
    s1.roll = 1;

//Unions
    union employee {
        char name[10];
        int id;
    };
    union employee e1;
    strcpy(e1.name,"Prapti");
    e1.id = 502;
    
    printf("%s",e1.name);

//File handling
    FILE *fptr;  // File pointer
    char ch;

    // Opening the file in write mode ("w")
    // If the file doesn't exist, it will be created. If it exists, it will be overwritten.
    fptr = fopen("test.txt", "w");

    // Check if the file exists
    if (fptr == NULL) {
        printf("Error opening file for writing.\n");
        return 1;  // Exit if file opening fails
    } else {
        fptr = fopen("test.txt", "w");
    }

    // Writing data to the file using fputc() function
    fputc('H', fptr);
    fputc('e', fptr);
    fputc('l', fptr);
    fputc('l', fptr);
    fputc('o', fptr);

    // Close the file after writing
    fclose(fptr);

    // Opening the file in read mode ("r")
    // The file must exist to be opened in this mode.
    fptr = fopen("test.txt", "r");

    // Reading data from the file using fgetc() function
    printf("Reading from file: \n");
    while ((ch = fgetc(fptr)) != EOF) {  // Loop until end of file is reached
        printf("%c", ch); // Print each character
    }

    // Close the file
    fclose(fptr);

    // "w" - Write mode. If the file exists, it is overwritten. If it does not exist, a new file is created.
    // "r" - Read mode. The file must already exist, and it is opened for reading only.
    // "a" - Append mode. Data is written to the end of the file. If the file does not exist, a new one is created.
    // "rb" - read for binary
    // "wb" - Write for binary
    // "a" - Append for binary

    //storage classes
        //storage class defines scope, default initial value and lifetime of a variable
        //automatic (default): local to function body, random value, till end of func block
        //external: global to the program they are defined in, 0, throughout lifetime of program
            //extern variable - to inform compiler that a given variable is defined somewhere else
        //static: local to func body, 0, throughout lifetime of program
        //register: local to func body, 0, till end of func block
            //stored in CPU register instead of memory

    //command line arguments   
        printf("%d",argc); //argc number of arguments
        printf("%s",argv[0]); //argv is array of strings containing arguments entered in command line
    

    //dynamic memory allocation
        ptr = (int *) malloc(5*sizeof(int));
        ptr = (int *) calloc(5,sizeof(int)); //initializes all to 0
        free(ptr);
        ptr = realloc(ptr,8); //here 8 is the new size to be allocated

    //classical codes
        //fibonacci
    
            int end;
            printf("Enter the number of terms: ");
            scanf("%d", &end);
        
            printf("Fibonacci Series: ");
            fibonacci_recursive(end);
            fibonacci_iterative(end);
            printf("\n");
        
            //factorial
            int num;
            printf("Enter a number to calculate its factorial: ");
            scanf("%d", &num);
        
            printf("Factorial of %d is %d\n", num, factorial_recursive(num));
            printf("Factorial of %d is %d\n", num, factorial_iterative(num));
        
            //armstrong number
            int num, original, remainder, count = 0, sum = 0;
        
            printf("Enter a number to check if it is an Armstrong number: ");
            scanf("%d", &num);
        
            original = num;
        
            int temp = num;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        
            temp = num;
            while (temp != 0) {
                remainder = temp % 10;
                sum += pow(remainder, count);
                temp /= 10;
            }
        
            if (sum == original) {
                printf("%d is an Armstrong number.\n", num);
            } else {
                printf("%d is not an Armstrong number.\n", num);
            }
        
            //linear search
            int n, key, found = 0;
        
            printf("Enter the number of elements: ");
            scanf("%d", &n);
        
            int arr[n];
            printf("Enter the elements of the array:\n");
            for (int i = 0; i < n; i++) {
                scanf("%d", &arr[i]);
            }
        
            printf("Enter the element to search: ");
            scanf("%d", &key);
        
            for (int i = 0; i < n; i++) {
                if (arr[i] == key) {
                    printf("Element %d found at position %d (index %d).\n", key, i + 1, i);
                    found = 1;
                    break;
                }
            }
        
            if (!found) {
                printf("Element %d not found in the array.\n", key);
            }
        
            //binary search
            int n, key, low, high, mid, found = 0;
        
            printf("Enter the number of elements: ");
            scanf("%d", &n);
        
            int arr[n];
            printf("Enter the sorted elements of the array:\n");
            for (int i = 0; i < n; i++) {
                scanf("%d", &arr[i]);
            }
        
            printf("Enter the element to search: ");
            scanf("%d", &key);
        
            low = 0;
            high = n - 1;
        
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] == key) {
                    printf("Element %d found at position %d (index %d).\n", key, mid + 1, mid);
                    found = 1;
                    break;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        
            if (!found) {
                printf("Element %d not found in the array.\n", key);
            }

    return 0;
}