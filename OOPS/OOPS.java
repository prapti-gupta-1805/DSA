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
        
                Student s2 = new Student(s1); //copies all info of s1 into s2
        
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