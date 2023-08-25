import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    static Scanner sc = new Scanner(System.in);
    private String name,msv,classes,mail;

    public Student() {
        this.msv = this.name = this.classes = this.mail = "";
    }
    
    public static Student nextStudent(Scanner sc){
        Student a = new Student();
        a.msv = sc.nextLine();
        a.name = sc.nextLine().trim();
        Normalize(a.name);
        a.classes = sc.nextLine();
        a.mail = sc.nextLine();
        return a;
    }

    public Student(String msv, String name, String classes, String mail) {
        this.name = name;
        this.msv = msv;
        this.classes = classes;
        this.mail = mail;
    }

    public static String Normalize(String name){
        String[] words = name.split("\\s+");
        String res = "";
        for(String word : words){
            res += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    @Override
    public String toString(){
        return msv+ " " + Normalize(name) + " " + classes + " " + mail;
    }

    @Override
    public int compareTo(Student other) {
        return this.msv.compareTo(other.msv);
    }

}

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++){
            students.add(Student.nextStudent(sc));
        }

        students.sort(null);
        for(Student student : students){
            System.out.println(student);
        }
    }
}
