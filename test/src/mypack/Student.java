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

    public void updateStudent(String id,Name name, String classes, String phone, Address addres) {
        this.setId(id);
        super.setName(name);
        this.setClasses(classes);
        super.setPhone(phone);
        super.setAddress(addres);
    }

    @Override 
    public String toString(){
        return super.id + " " + super.name + " " + this.classes + " " + super.phone + " " + super.address ;
    }

}