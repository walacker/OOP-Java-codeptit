import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student >{
    private String name,code;
    private float[] p = new float[10];
    private float avg;
    
    Student(int t,String name , float[] p){
        this.code = String.format("%02d", t);
        this.name = name;
        this.p = p;
    }

    public String getName() {
        return name;
    }
    
    public float getavg(){
        avg = 0f;
        for (int i = 0; i < 10; i++) {
            avg += p[i] * ((i == 0 || i == 1) ? 2f : 1f);
        }
        avg /= 12f;
        avg = (float) Math.round((float) (avg) * 10f) / 10f;
        return avg;
    }

    public String getCode() {
        return code;
    }

    private String rank() {
        if (avg >= 9f) {
            return "XUAT SAC";
        }
        if (avg >= 8f) {
            return "GIOI";
        }
        if (avg >= 7f) {
            return "KHA";
        }
        if (avg >= 5f) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public String toString(){
        float res = getavg() ;
        return "HS" + code + " " + name + " " + String.format("%.1f", res) + " " + rank();
    }

    @Override
    public int compareTo(Student other) {
        if((int) 10 * (this.getavg() - other.getavg()) != 0)
                    return (int) (10 * (other.getavg() - this.getavg()));
                return this.getCode().compareTo(other.getCode());
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i ++ ){
            sc.nextLine();
            String name = sc.nextLine();
            float[] p = new float[10];
            for (int j = 0; j < 10; j++) {
                p[j] = sc.nextFloat();
            }
            list.add(new Student(i+1, name, p));
        }

        list.sort(null);
        for (Student e : list) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Solve();
    }
}
