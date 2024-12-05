/*
Objects: entities
Class: group of those entities

Classes have attributes (properties) and functions (behaviors)

Example:
Object: Pen
- Color: String (blue)
- Tip: int (5)
- Methods: setColor(), setTip()

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
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("Blue");
        System.out.println("Pen Color: " + p1.getColor());
        p1.setTip(5);
        System.out.println("Pen Tip: " + p1.getTip());

        p1.setColor("Yellow"); // Modifying color using setter
        System.out.println("Updated Pen Color: " + p1.getColor());

        // BankAccount Example
        BankAccount myAcc = new BankAccount();
        myAcc.setUsername("PraptiGupta");
        myAcc.setPassword("abcd"); // Password set securely
        System.out.println("Bank Username: " + myAcc.getUsername());
        // Note: Password won't be printed for security reasons.

        // Pencil Example
        Pencil p2 = new Pencil();
        p2.setColor("Green");
        System.out.println("Pencil Color: " + p2.getColor());
        p2.setTip(8);
        System.out.println("Pencil Tip: " + p2.getTip());
    }
}

class BankAccount {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Pen {
    private String color;
    private int tip;

    // Getters
    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    // Setters
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Pencil {
    private String color;
    private int tip;

    // Getters
    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    // Setters
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int newTip) {
        this.tip = newTip;
    }
}