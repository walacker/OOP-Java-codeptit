import java.util.Scanner;

class Student{
    private String code,name;
    private double math,physical,chemistry,bonus;

    public Student(String code,String name,double math,double physical,double chemistry){
        this.code = code;
        this.name = name;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;

        code = code.substring(0, 3);
        switch(code){
            case "KV1":
                bonus = 0.5;
                break;
            case "KV2":
                bonus = 1.0;
                break;
            case "KV3":
                bonus = 2.5;
                break;
        }
    }

    private double sum(){
        return math*2 + physical + chemistry ;
    }

    private String getRank(){
        double sum = sum() + bonus ;
        if(sum >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public String formatDouble(double x) {
        int xInt = (int) (x * 10);
        return xInt % 10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
    }

    @Override
    public String toString() {
        double sum = sum();
        return code + " " + name + " " + formatDouble(bonus)+ " " + formatDouble(sum)  + " " + getRank();
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        String code = sc.nextLine();
        String name = sc.nextLine();
        double math = Double.parseDouble(sc.nextLine());
        double physical = Double.parseDouble(sc.nextLine());
        double chemistry = Double.parseDouble(sc.nextLine());
        Student stu = new Student(code,name,math,physical,chemistry);
        System.out.println(stu);
    }
    public static void main(String[] args) throws Exception {
        Solve();
    }
}
