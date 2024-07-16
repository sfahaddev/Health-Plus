/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Donate {
   private int age, noofbottles;
    private String name, contact, bloodtype;

    // Default constructor
    public Donate() {
        this.age = 0;
        this.noofbottles = 0;
        this.name = "";
        this.contact = "";
        this.bloodtype = "";
    }

    // Constructor with all fields
    public Donate(String name, String bloodtype, int noofbottles, int age, String contact) {
        this.name = name;
        this.bloodtype = bloodtype;
        this.noofbottles = noofbottles;
        this.age = age;
        this.contact = contact;
    }

    // Constructor with bloodtype and noofbottles
    public Donate(String bloodtype, int noofbottles) {
        this.bloodtype = bloodtype;
        this.noofbottles = noofbottles;
        this.age = 0;
        this.name = "";
        this.contact = "";
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoofbottles() {
        return noofbottles;
    }

    public void setNoofbottles(int noofbottles) {
        this.noofbottles = noofbottles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Override
    public String toString() {
        return "Donate{" + "age=" + age + ", noofbottles=" + noofbottles + ", name=" + name + ", contact=" + contact + ", bloodtype=" + bloodtype + '}';
    }    
}
