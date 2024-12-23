/*
Objects: entities
Class: group of those entities

Classes have attributes (properties) and functions (behaviors)

Access Modifiers:
- Private, Default, Protected, Public

Getters & Setters:
- Get: to return the value
- Set: to modify the value

'this': keyword used to refer to the current object.

creating multiple constructors for same class and calling according to convenience is called 'constructor overloading'

types of constructors:
 - non-parameterized: eg. Student()
 - parameterixed: eg. Student(String name)
 - copy constructor: passing an object as a parameter in a constructor to copy it's properties 
    - if you copy value of an Object from a constructor, instead of a copy of the Object being formed, only a new variale is formed that points to the same old Object. (shallow copy)

Shallow and deep copy:
- shallow copy: changes copy
- deep copy: changes don't copy
*/
public class OOPS {
    public static void main(String[] args) {
        // Pen Example
        Pen p1 = new Pen(); //Pen() is a constructor
        p1.Color = "Blue";
        p1.Tip = 5;  //Setting without setter - can be done because color and tip are public attributes
        System.out.println("Pen Color: " + p1.getColor());
        System.out.println("Pen Tip: " + p1.getTip()); // Using getters to get color and tip

        // BankAccount Example
        BankAccount myAcc = new BankAccount("PraptiGupta"); //using constructor to initialize an object
        myAcc.setUsername("PoojaGupta"); //using setter to set username
        //myAcc.password = "abcd"; - won't work because password is private. have to use a setter to access it
        myAcc.setPassword("abcd");
        System.out.println("Bank Username: " + myAcc.getUsername());
        System.out.println("Bank Password: " + myAcc.getPassword()); // can be done because getPassword is defined inside the class Bankaccount

        //Student
        Student s1 = new Student();
                s1.name = "Prapti";
                s1.roll = 502;
                s1.cgpa = 9.0;
                s1.marks[0] = 99;
                s1.marks[1] = 100;
                s1.marks[2] = 89;
        
                //Student s2 = new Student(s1); //copies all info of s1 into s2
        
        //Animal, Mammal, Dog
        Dog bruno = new Dog();
        bruno.color = "brown"; //base class attribute
        System.out.println(bruno.color);
        bruno.legs = 4; //first derived class attribute
        System.out.println(bruno.legs);
        bruno.breed = "labrador"; //second derived class attribute
        System.out.println(bruno.breed);


        Animal2 a = new Animal2();
        a.eats();
        deer b = new deer();
        b.eats();

        //Animal3 a = new Animal3(); - will throw error as Animal3 is an abstract class
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walk();
        c.walk();

        System.out.println(h.colour);
        h.changeColour();
        System.out.println(h.colour);

        //Mustang mustang = new Mustang(); //to understand the heirarchy in which constructors are called

        Queen q = new Queen();
        q.moves();

        Student1 S1 = new Student1();
        Student1 S2 = new Student1();
        S1.schoolName = "Ahlcon Public School";
        System.out.println(S2.schoolName);

    }
}

        
/* 
<-- ENCAPSULATION -->
Encapsulation is defined as the wrapping up of data (attributes) & methods (functions) under a single unit. It also implements data hiding (using access modifiers).
 */

        class Pen {
            String Color;
            int Tip;
        
            // Getters
            public String getColor() {
                return Color;
            }
            public int getTip() {
                return Tip;
            }
        
            // Setters
            public void setColor(String newColor) {
                this.Color = newColor;
            }
            public void setTip(int newTip) {
                this.Tip = newTip;
            }
        }
        
        class BankAccount {
            String username;
            private String password; // Private attribute for password
        
            // Getters
            public String getUsername() {
                return username;
            }
            public String getPassword() {
                return password;
            }
        
            // Setters
            public void setUsername(String username) {
                this.username = username;
            }
            public void setPassword(String password) {
                this.password = password;
            }
            
            BankAccount (String username) {
                this.username = username;
            }
        }
        
        class Student {
            String name;
            int roll;
            double cgpa;
            int marks[];
        
            // //shallow copy constructor
            // Student(Student s1) {
            //     this.name = s1.name;
            //     this.roll = s1.roll;
            //     this.cgpa = s1.cgpa;
            //     this.marks = s1.marks;
            // }

            //deep copy constructor
            Student(Student s1) {
                this.name = s1.name;
                this.roll = s1.roll;
                this.cgpa = s1.cgpa;
                this.marks = new int[3];
                for (int i=0; i<3; i++) {
                    this.marks[i] = s1.marks[i];
                }
            }
        
            public Student() {
                this.marks = new int[3];
            }
}

/*
<-- INHERITANCE -->
Inheritance is when properties & methods of base class are passed on to a derived class.

single level inheritance: base -> derived
multi level inheritance: base -> derived --> derived
heirarchial inheritance: multiple derived classes of same base class
hybrid inheritance: more than one type of inheritance is combined within the same class heirarchy
multiple inheritance: using interfacing
*/

//base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
}

//derived class

class Fish extends Animal {
    void swims() {
        System.out.println("swims");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

/*
<-- POLYMORPHISM -->
Polymorphism allows entities such as functions or objects to operate in multiple forms/behave differently based on the context.
Two types:
 - compile time polymorphism (static):
    - method overloading: multiple functions with same name but different parameters
 - run time polymmorphism (dynamic):
    - method overriding: parent and child classes both contain the same function with a different definition
*/

//method overloading - when you call sum(), it will choose which one to run according to the inputted parameters
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b;
    }
}

//method overriding
class Animal2 {
    void eats() {
        System.out.println("omnivore");
    }
}

class deer extends Animal2 {
    void eats() {
        System.out.println("herbivore");
    }
}

/*
<--PACKAGES-->
Package is a group of similar types of classes, interfaces, and sub-packages.

in-built package: eg. java.util.*
user defined package: 
 */

/*
<-- ABSTRACTION -->
Hiding all the unnecessary details and showing only the important parts to the user.
Abstract classes:
    - can't create intance
    - can have abstract/non-abstract functions
    - can have a constructor
Interfaces:
*/

abstract class Animal3 {
    String colour;
    abstract void walk();
    Animal3() {
        System.out.println("animal constructor called");
        colour = "brown";
    }
}

class Chicken extends Animal3 {
    void walk() {
        System.out.println("walks on two legs");
    }
    void changeColour() {
        colour = "yellow";
    }
}

class Horse extends Animal3 {
    Horse() {
        super.colour = "black"; //super keyword
        System.out.println();
        System.out.println("Horse constructor called");
    }
    void walk() {
        System.out.println("walks on four legs");
    }
    void changeColour() {
        colour = "dark brown";
    }
}

class Mustang extends Horse {  //to understand the heirarchy in which constructors are called
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
/*
Interfaces - blueprint of a class
eg. blueprint of a generic car (interface) -> blueprint of a Maruti 800 (class) -> Maruti 800 car (object)

uses:
 - multiple inheritance
 - total astraction

- All methods are public, abstract & without implementation
- Used to achieve total abstraction
- Variables in the interface are final, public, and static
 */

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("all directions");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("W A S D");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("all directions by 1 step");
    }
}

//syntax for multiple interfaces
//class Bear implements Herbivore,Carnivore {
//}

//static keyword - use to share same variable/method of a given class

class Student1 {
    String name;
    int roll;
    
    static String schoolName;
}

//super keyword - accesses parent class's properties, functions && constructor
//in Horse class
