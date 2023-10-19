import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();
    static int count = 1 ;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String classes = sc.nextLine();
            String mail = sc.nextLine();
            String enterprise = sc.nextLine();
            list.add(new Student(count++,code,name,classes,mail,enterprise));
        }

        list.sort((a,b) -> a.getname().compareTo(b.getname()));

        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String req = sc.nextLine();
            list.forEach(student -> {
                if(student.getEnterprise().equals(req)) System.out.println(student);
            });
        }
    }
}

class Student{
    private int count;
    private String code,name,classes,mail,enterprise;

    public Student(int count ,String code, String name, String classes, String mail, String enterprise) {
        this.count = count;
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.mail = mail;
        this.enterprise = enterprise;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString(){
        return count + " " + code + " " + name + " " + classes + " " + mail + " " + enterprise;
    }
}
