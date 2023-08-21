import java.util.ArrayList;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String name,date,code,msv;
    private double point;

    Student(){
        name = "";
        code = "";
        date = "";
        point = 0;
    }

    Student(int t,String name,String code,String date,double point){
        this.msv = "B20DCCN" + String.format("%03d", t);
        this.name = name;
        this.code = code;
        this.date = date;
        this.point = point;
    }

    public String Normalize(String s){
        String[] a = s.split("\\s+");
        for(int i=0; i<a.length; i++){
            a[i] = a[i].toLowerCase();
            a[i] = a[i].substring(0,1).toUpperCase() + a[i].substring(1);
        }
        return String.join(" ", a);
    }

    public String chuanhoa(String date){
        if(date.charAt(1) == '/') date = date.substring(0, 0) + "0" + date.substring(0);
        if(date.charAt(4) == '/') date = date.substring(0, 3) + "0" + date.substring(3);
        return date;
    }

    public double getPoint(){
        return point;
    }
    
    @Override
    public String toString() {
        return msv + " " + Normalize(name) + " " + code + " " + chuanhoa(date) + String.format(" %.2f", point);
    }

    @Override 
    public int compareTo(Student other){
        return (int) ((int) 100 * (other.getPoint() - this.getPoint()));
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String name = sc.nextLine().trim();
            String code = sc.nextLine();
            String date = sc.nextLine();
            double point = Double.parseDouble(sc.nextLine());
            list.add(new Student(i+1,name, code,date,point));
        }

        list.sort(null);
        for(Student i : list){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}