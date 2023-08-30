import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(Student.newStudent(sc));
        }

        list.sort((a,b) -> {
            if (a.total == b.total)
                return a.code.compareTo(b.code);
            return b.total.compareTo(a.total);
        });
        list.get(0).rank = 1;
        for(int i = 1 ; i < n ; i++){
            list.get(i).rank = list.get(i).total.equals(list.get(i-1).total) ? list.get(i-1).rank : i + 1;
        }

        list.forEach(System.out::println);
    }
}

class Student{
    private String name;
    private double s1,s2,s3;
    int rank ;
    String code;
    public static int count = 1;
    Double total;

    public Student(String name, double s1, double s2, double s3) {
        this.code = String.format("SV%02d", count++);
        this.name = Normalize(name);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.total = (s1 * 3  + s2 * 3 + s3 * 2) / 8;
    }

    public static Student newStudent(Scanner sc){
        String name = sc.nextLine();
        double s1 = Double.parseDouble(sc.nextLine());
        double s2 = Double.parseDouble(sc.nextLine());
        double s3 = Double.parseDouble(sc.nextLine());
        return new Student(name, s1, s2, s3);
    }

    public String Normalize(String s){
        String[] arr = s.trim().split("\\s+");
        String res = "";
        for (String string : arr) {
            res += string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public String Total(){
        return String.format("%.2f", total);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + Total() + " " + rank;
    }
}