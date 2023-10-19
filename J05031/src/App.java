import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        list.sort((a,b) -> a.getName().compareTo(b.getName()));

        list.forEach((item) -> {
            System.out.println(++count + " " + item);
        });
    }
}

class Student {
    private String code, name, classes;
    private Double m1, m2, m3;

    public Student(String code, String name, String classes, Double m1, Double m2, Double m3) {
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Double getM1() {
        return m1;
    }

    public void setM1(Double m1) {
        this.m1 = m1;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Double getM3() {
        return m3;
    }

    public void setM3(Double m3) {
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + classes + " " + m1 + " " + m2 + " " + m3;
    }

}