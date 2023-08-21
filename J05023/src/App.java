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

    public String getyear(){
        return classes.substring(1,3);
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
            String res = className.substring(2, 4);
            System.out.println("DANH SACH SINH VIEN KHOA " + className + ":");
            for (int i = 0; i < list.size(); i++) {
                if (res.equals(list.get(i).getyear())) {
                    System.out.println(list.get(i));
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
