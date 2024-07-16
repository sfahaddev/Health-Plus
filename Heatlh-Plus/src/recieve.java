/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amna
 */
public class recieve {
     private int age,noofbottles;
    private String name,contact,bloodtype;

    public recieve() {
       this.age = 0;
        this.noofbottles = 0;
        this.name = "";
        this.contact = "";
        this.bloodtype = "";
    }

    public recieve(int age, int noofbottles, String name, String contact, String bloodtype) {
        this.age = age;
        this.noofbottles = noofbottles;
        this.name = name;
        this.contact = contact;
        this.bloodtype = bloodtype;
    }

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
        return "recieve{" + "age=" + age + ", noofbottles=" + noofbottles + ", name=" + name + ", contact=" + contact + ", bloodtype=" + bloodtype + '}';
    }

    
    
}

