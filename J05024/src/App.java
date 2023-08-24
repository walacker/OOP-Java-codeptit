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

    public String getClasses(){
        return classes;
    }

    public String getCode(){
        return code;
    }
    public String getNganh(){
        String s = this.code;
        return s.substring(3, 7);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + classes + " " + mail;
    }

}

public class App{
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

        int Q = Integer.parseInt(sc.nextLine());
        while (Q-- > 0) {
            String s = sc.nextLine();
            String res = "";
            switch (s.toUpperCase()) {
                case "KE TOAN":
                    res = "DCKT";
                    break;
                case "CONG NGHE THONG TIN":
                    res = "DCCN";
                    break;
                case "AN TOAN THONG TIN":
                    res = "DCAT";
                    break;
                case "VIEN THONG":
                    res = "DCVT";
                    break;
                case "DIEN TU":
                    res = "DCDT";
                    break;
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (Student x : list) {
                if(x.getNganh().compareTo(res) == 0){
                    if(res == "DCCN" || res == "DCAT"){
                        if(x.getClasses().charAt(0) != 'E')
                            System.out.println(x);
                    }
                    else System.out.println(x);
                }
            }  
        }

    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
