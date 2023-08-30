import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        List<Student> List = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            List.add(Student.newStudent(sc));
        }
        List.sort((a, b) -> {
            if (a.total == b.total)
                return a.code.compareTo(b.code);
            return b.total.compareTo(a.total);
        });

        int amount = Integer.parseInt(sc.nextLine());
        double benchmark;
        if (amount >= n) {
            for (Student i : List) i.review = "TRUNG TUYEN";
            benchmark = List.get(n-1).total;
        }
        else {
            benchmark = List.get(amount - 1).total;
            for (Student i : List) {
                i.review = (i.total >= benchmark) ?  "TRUNG TUYEN" : "TRUOT";
            }
        }
        System.out.println(String.format("%.1f", benchmark));
        List.forEach(System.out::println);
    }
}

class Student {
    String code,name,review ; 
    Double Math, Physics, Chemistry, priority,total;

    public Student(String code, String name, Double Math, Double Physics, Double Chemistry) {
        this.code = code;
        this.name = Normalize(name);
        this.Math = Math;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
        this.total = total();
        this.priority = uuTien();
    }

    public static Student newStudent(Scanner sc){
        String code = sc.nextLine();
        String name = sc.nextLine();
        Double Math = Double.parseDouble(sc.nextLine());
        Double Physics = Double.parseDouble(sc.nextLine());
        Double Chemistry = Double.parseDouble(sc.nextLine());
        return new Student(code, name, Math, Physics, Chemistry);
    }

    public String Normalize(String str){
        String[] s = str.trim().split("\\s+");
        String res = "";
        for (String string : s) {
            res += string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase() + " ";
        }
        return res.trim() ;
    }

    public double uuTien(){
        switch (code.charAt(2)) {
            case '1': return 0.5;
            case '2': return 1.0;
            case '3':   return 2.5;
        }
        return 0;
    }

    public double total(){
        return Math * 2 + Physics + Chemistry + uuTien();
    }

    @Override
    public String toString() {
        return code + " " + name + " " + (priority == priority.intValue() ? priority.intValue() : String.format("%.1f", priority)) + " " + (total == total.intValue() ? total.intValue() : String.format("%.1f", total)) + " " + review;
    }
}