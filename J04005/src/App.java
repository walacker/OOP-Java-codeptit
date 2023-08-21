import java.util.Scanner;

class Student{
    private String name,date ;
    private double sub1,sub2,sub3;

    Student(){
        name = "";
        date = "";
        sub1 = 0 ;
        sub2 = 0 ; 
        sub3 = 0 ; 
    }

    Student(String name,String date,double sub1,double sub2,double sub3){
        this.name = name;
        this.date = date;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    private double sum(double sub1,double sub2,double sub3){
        return sub1 + sub2 + sub3;
    }

    @Override
    public String toString() {
        double res = sum(this.sub1, this.sub2,this.sub3);
        return name + " " + date + String.format(" %.1f", res);
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        String name = sc.nextLine();
        String dob = sc.nextLine();
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        Student stu = new Student(name, dob, p1, p2, p3);
        System.out.println(stu);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


