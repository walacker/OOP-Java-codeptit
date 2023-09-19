package mypack;

import java.util.Scanner;

public class Person {
    static Scanner sc = new Scanner(System.in);
    protected String id;
    private String phone;
    private Name name;
    private Address address;

    public Person(String id, Name name, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getInfo(){
        return id + " " + name + " " + phone + " " + address ;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
    }

    
}
