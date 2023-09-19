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

}