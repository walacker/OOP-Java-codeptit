import java.util.Scanner;

class Student{
    private String name,code;
    private long point;

    Student(){
        name = "";
        code = "";
        point = 0;
    }

    Student(String code,String name,long point){
        this.name = name;
        this.code = code;
        this.point = point;
    }

    private int chuanhoa(String code){
        String res = code.substring(0, 2); 
        int pos = 0;
        switch(res){
            case "HP":
                pos = 900000;
                break;
            case "HT":
                pos = 2000000;
                break;
            case "GV":
                pos = 500000;
                break;
        }
        return pos;
    }

    private int luong(String code){
        String res = code.substring(2, 4);
        int pos =  Integer.valueOf(res);
        return pos;
    }

    @Override
    public String toString() {
        int res = chuanhoa(code);
        int luong = luong(code);
        return code + " " + name + " " + luong + " " + res  + " " +  ((luong * point) + res ) ;
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        String code = sc.nextLine();
        String name = sc.nextLine();
        long point = sc.nextLong();
        Student stu = new Student(code,name,point);
        System.out.println(stu);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}