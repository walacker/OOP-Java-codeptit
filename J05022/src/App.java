import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private String code,name,classes , mail ;

    Student(String code , String name , String classes , String mail){
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + classes + " " + mail;
    }

}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String classes = sc.nextLine();
            String mail = sc.nextLine();
            list.add(new Student(code, name, classes, mail));
        }

        int Q = sc.nextInt();
        while (Q-- > 0) {
            String className = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + className + ":");
            for (int i = 0; i < list.size(); i++) {
                if (className.equals(list.get(i).getClasses())) {
                    System.out.println(list.get(i));
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
