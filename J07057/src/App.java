import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(Student.newStudent(sc));
        }

        list.sort((a,b) -> {
            if(b.total - a.total != 0){
                return b.total.compareTo(a.total);
            }
            return a.id.compareTo(b.id);
        });

        list.forEach(System.out::println);

    }
}

class Student{
    private String name,ethnic ; 
    private int region ;
    public static int count = 1;
    Double point,bonus,total;
    String id;

    public Student(String name,Double point ,String ethnic , int region){
        this.id = String.format("TS%02d", count++);
        this.name = Normalize(name);
        switch(region){
            case 1 : 
                bonus = 1.5 ; break;
            case 2 : 
                bonus = (double) 1 ; break;
            case 3 : 
                bonus = (double) 0 ; break;
        }

        switch(ethnic){
            case "Kinh" :
                break;
            default : 
                bonus += 1.5 ; break;
        }

        this.total = point + bonus;
    }

    public static Student newStudent(Scanner sc){
        String name = sc.nextLine();
        Double point = Double.parseDouble(sc.nextLine());
        String ethnic = sc.nextLine();
        int region = Integer.parseInt(sc.nextLine());
        return new Student(name,point,ethnic,region);
    }

    public String Normalize(String name){
        String[] s = name.trim().split("\\s+");
        String res = "";
        for(String x:s){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public String status(){
        if(total >= 20.5){
            return "Do";
        }
        return "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + total + " " + status();
    }
}
