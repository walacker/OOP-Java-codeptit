import java.util.Scanner;

class Student{
    private String name,date,code;
    private double point;

    Student(){
        name = "";
        code = "";
        date = "";
        point = 0;
    }

    Student(String name,String code,String date,double point){
        this.name = name;
        this.code = code;
        this.date = date;
        this.point = point;
    }

    private String chuanhoa(String date){
        if(date.charAt(1) == '/') date = date.substring(0, 0) + "0" + date.substring(0);
        if(date.charAt(4) == '/') date = date.substring(0, 3) + "0" + date.substring(3);
        return date;
    }

    @Override
    public String toString() {
        String res = chuanhoa(date);
        return "B20DCCN001 " + name + " " + code + " " + res + String.format(" %.2f", point);
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        String name = sc.nextLine();
        String code = sc.nextLine();
        String date = sc.nextLine();
        double point = sc.nextDouble();
        Student stu = new Student(name, code,date,point);
        System.out.println(stu);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}