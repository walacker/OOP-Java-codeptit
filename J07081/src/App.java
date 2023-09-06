import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(Student.getStudent(sc));
        }

        list.sort((a,b) -> {
            if (!a.getFirst().equals(b.getFirst()))
                return a.getFirst().compareTo(b.getFirst());
            if (!a.getLast().equals(b.getLast()))
                return a.getLast().compareTo(b.getLast());
            if(!a.getMiddle().equals(b.getMiddle()))
                return a.getMiddle().compareTo(b.getMiddle());
            return a.getCode().compareTo(b.getCode());
        });

        list.forEach(System.out::println);
    }
}

class Student{
    private String code,name,phone,mail,firstName,lastName,middleName;

    public Student(String code, String name, String phone, String mail) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        String[] arr = name.trim().split("\\s+");
        this.firstName = arr[arr.length - 1];
        this.lastName = arr[0];
        this.middleName = String.join(" ", Arrays.copyOfRange(arr, 1, arr.length - 1));
    }

    public static Student getStudent(Scanner sc){
        String code = sc.nextLine();
        String name = sc.nextLine();
        String phone = sc.nextLine();
        String mail = sc.nextLine();
        return new Student(code, name, phone, mail);
    }

    public String getCode() {
        return this.code;
    }

    public String getFirst(){
        return this.firstName;
    }

    public String getLast(){
        return this.lastName;
    }

    public String getMiddle(){
        return this.middleName;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + phone + " " + mail;
    }
}
