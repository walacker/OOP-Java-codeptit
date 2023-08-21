import java.util.Scanner;

class Student{
    private String name;
    private long point,ngay,thuong;

    Student(){
    }

    Student(String name,long point,long ngay ,String code){
        this.name = name;
        this.point = point * ngay;
        this.ngay = ngay;

        switch(code){
            case "GD":
                thuong = 250000;
                break;
            case "PGD":
                thuong = 200000;
                break;
            case "TP":
                thuong = 180000;
                break;
            case "NV":
                thuong = 150000;
                break;
        }
    }

    private long phucap(long point,long ngay){
        if(ngay >= 25) return point/5;
        else if(ngay >= 22) return point/10;
        else return 0;
    }

    @Override
    public String toString() {
        long pos = phucap(point, ngay);
        long luong = thuong + pos + point;
        return String.format("NV01 %s %s %d %d %d",name,point,pos,thuong,luong);
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        String name = sc.nextLine();
        long point = sc.nextLong();
        long ngay = sc.nextLong();
        String code = sc.next();
        Student stu = new Student(name,point,ngay,code);
        System.out.println(stu);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}