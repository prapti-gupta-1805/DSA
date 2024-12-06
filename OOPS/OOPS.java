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
*/
public class OOPS {
    public static void main(String[] args) {
        // Pen Example
        Pen p1 = new Pen();
        p1.Color = "Blue";
        p1.Tip = 5;  //Setting colour without setter - can be done because color and tip are public attributes
        System.out.println("Pen Color: " + p1.getColor());
        System.out.println("Pen Tip: " + p1.getTip()); // Using getters to get color and tip

        // BankAccount Example
        BankAccount myAcc = new BankAccount();
        myAcc.setUsername("PraptiGupta"); //using setter to set username
        //myAcc.password = "abcd"; - won't work because password is private. have to use a setter to access it
        myAcc.setPassword("abcd");
        System.out.println("Bank Username: " + myAcc.getUsername());
        System.out.println("Bank Password: " + myAcc.getPassword()); // can be done because getPassword is defined inside the class Bankaccount
    }
}

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
}

/* 
ENCAPSULATION:
defined as the wrapping up of data & methods under a single unit. It also implements ata hiding.

 */