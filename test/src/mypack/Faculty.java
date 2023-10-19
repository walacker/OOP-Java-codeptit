package mypack;

public class Faculty extends Person {
    private String job;

    public Faculty(String id, Name name, String job, String phone, Address address) {
        super(id, name, phone, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void updateTeachcer(String id,Name name,String job,String phone, Address address) {
        super.setId(id);
        super.setName(name);
        this.setJob(job);
        super.setPhone(phone);
        super.setAddress(address);
    }

    @Override 
    public String toString(){
        return super.id + " " + super.name + " " + this.job + " " + super.phone + " " + super.address ;
    }
}