package mypack;

public class Student extends Person {
    private String classes;

    public Student(String id, Name name, String classes, String phone, Address address) {
        super(id, name, phone, address);
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}