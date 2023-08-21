import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {

    public int code;
    public String name, dob;
    public Float p1, p2, p3, total;

    public Student(int d,String name, String dob, float p1, float p2, float p3) {
        this.code = d;
        this.name = name;
        this.dob = dob;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.total = p1 + p2 + p3;
    }

    public double getPoint(){
        return this.p1 + this.p2 + this.p3;
    }

    public int getCode(){
        return code;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + dob + " " + total;
    }

    @Override
    public int compareTo(Student other) {
        if(other.getPoint() != this.getPoint()){
                    return (int) ((int)10 * (other.getPoint() - this.getPoint()));
                }
                return this.getCode() - other.getCode();
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dob = sc.nextLine();
            float p1 = Float.parseFloat(sc.nextLine());
            float p2 = Float.parseFloat(sc.nextLine());
            float p3 = Float.parseFloat(sc.nextLine());
            list.add(new Student(i+1,name, dob, p1, p2, p3));
        }

        Collections.sort(list);
        float highest = list.get(0).total;
        for (Student e : list) {
            if (e.total == highest) {
                System.out.println(e);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solve();
        sc.close();
    }
}