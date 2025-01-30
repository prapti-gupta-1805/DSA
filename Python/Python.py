import math  # Importing the math module


def main():
    # Single-line comment
    '''
    Multiple
    Line
    Comment
    '''

    a = input("What is your name?  ")  # Taking input

    print("Hello " + a + "!!")
    print("Hello", a, "!!")
    print(f"Hello {a}")

    # Using `end` and `sep` in `print()`
    print("a", end="")  ##end = '\n' by default
    print("a" + "b", sep="")  #sep = " " by default

    # To print quotes within quotes
    print('Hello "friend"')  # Using single quotes
    print("hello \"friend\"")  # Escaping double quotes with backslash

    # String manipulation
    name = "prapti gupta"
    name1 = "                 PRAPTI                 "
    name2 = "prapti"

    # Removing leading and trailing whitespaces
    print("/" + name1.strip() + "/")  # Removes spaces from both sides
    print("/" + name1.lstrip() + "/")  # Removes spaces from left side
    print("/" + name1.rstrip() + "/")  # Removes spaces from right side
    # Remove specific characters (in this case, 'i')
    print(name2.strip('i'))  # Removes 'i' from both ends

    # Capitalize the first letter
    print(name.capitalize())

    # Convert to title case
    print(name.title())

    # Splitting string into words
    first, last = name.split(" ")  # Splits the name into first and last
    print(first + " | " + last)

    # Basic Calculator
    x = float(input("Enter first number: "))
    y = float(input("Enter second number: "))

    print("Addition:", (x + y))
    print("Subtraction:", (x - y))
    print("Multiplication:", (x * y))
    print("Division:", (x / y))

    #Exponentiation - (a**b)
    #Modulo - (a%b)

    #Rounding
    z = round(x + y)  # Rounding the result to nearest integer
    print(round(z, 2))  # Round to 2 decimal places

    # Adding commas to numbers
    print(f"{z:,}")  # Output 1,000,000 format

    # Using math module functions
    x = pow(2, 2)  # 2 raised to the power of 2
    y = math.sqrt(x)  # Square root of x
    print(x, y)

    # Function definition
    a = hello("Sweetu")  # Function call with argument
    b = hello()  # Function call without argument (defaults to "world")
    print(a, b)

    # Conditional Statements (if, elif, else)
    if (x < y):
        print(y, "is greater than", x)
    elif (x > y):
        print(x, "is greater than", y)
    else:
        print("Numbers are equal")

    # Logical Operators (`and`, `or`)
    if x > y or x < y:
        print(x, "is not equal to", y)

    if x > 0 and y > 0:
        print("Both are positive numbers")

    # Alternative compact syntax
    #print(True) if n % 2 == 0 else print(False)
    #(if x > 0 and x < 10) = (if 10 > x > 0)

    # Match Statement
    name = input("What's your favourite Harry Potter character?")
    
    match name:
        case "Harry" | "Hermione" | "Ron":  # Multiple cases (Harry, Hermione, Ron)
            print("Gryffindor")
        case "Draco":
            print("Slytherin")
        case "Cedric":
            print("Hufflepuff")
        case "Cho":
            print("Ravenclaw")
        case _:
            print("Who?")  # Default case

    #while loop
    n = 0
    while n != 5:
        print("Meow!")
        n+=1

    #for loop
    for i in range(0,5,1):
        print("woof!")

# Function definition
def hello(x="world"):  # Default argument 'world'
    y = ("Hello " + x + " !!")
    return y

# Calling the main function
main()