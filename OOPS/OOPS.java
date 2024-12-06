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
*/public class OOPS {
    public static void main(String[] args) {
        // Pen Example
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.Color = "Blue"; 
        System.out.println("Pen Color: " + p1.Color); // Using the getter to get color
        p1.Tip = 5;
        System.out.println("Pen Tip: " + p1.Tip); // Using getter to get the tip size

        p1.setColor("Yellow"); // Modifying color using setter
        System.out.println("Updated Pen Color: " + p1.getColor());

        // BankAccount Example
        BankAccount myAcc = new BankAccount(); // Created a BankAccount object called myAcc
        myAcc.setUsername("PraptiGupta"); // Set the username
        //myAcc.password = "abcd"; - won't work because password is private. have to use a setter to access it
        myAcc.setPassword("abcd"); // Set the password
        System.out.println("Bank Username: " + myAcc.getUsername());
        System.out.println("Bank Password: " + myAcc.getPassword()); // can be done because getPassword is defined inside the class Bankaccount
    }
}

class Pen {
    String Color; // Private attribute, can't be accessed directly
    int Tip; // Private attribute, can't be accessed directly

    // Getter for color
    public String getColor() {
        return Color;
    }

    // Getter for tip size
    public int getTip() {
        return Tip;
    }

    // Setter for color
    public void setColor(String newColor) {
        this.Color = newColor;
    }

    // Setter for tip size
    public void setTip(int newTip) {
        this.Tip = newTip;
    }
}

class BankAccount {
    String username; // Private attribute for username
    private String password; // Private attribute for password

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter for password (password can be set but not retrieved directly)
    public void setPassword(String password) {
        this.password = password; // Private to protect security
    }
}

class Pencil {
    private String color; // Private attribute for color
    private int tip; // Private attribute for tip size

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for tip size
    public int getTip() {
        return tip;
    }

    // Setter for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Setter for tip size
    public void setTip(int newTip) {
        this.tip = newTip;
    }
}
