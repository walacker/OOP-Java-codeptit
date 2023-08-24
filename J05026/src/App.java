import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Teacher implements Comparable<Teacher>{
    private String code,name,classes ;

    Teacher(int d,String name , String classes){
        this.code = "GV" + String.format("%02d", d);
        this.name = name;
        this.classes = classes;
    }

    public String getClasses(){
        String s = this.classes;
        String[] arr = s.split(" ");
        String res = "";
        for(int i = 0 ; i < arr.length ; i++){
            res += arr[i].substring(0, 1).toUpperCase() ;
        }
        return res;
    }

    public String getLastName(){
        String s = this.name;
        int index = s.lastIndexOf(" ");
        return s.substring(index + 1);
    }

    @Override
    public String toString(){
        return code + " " + name + " " + getClasses();
    }

    @Override
    public int compareTo(Teacher other){
        return this.getLastName().compareTo(other.getLastName());
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        List<Teacher> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String name = sc.nextLine();
            String classes = sc.nextLine();
            list.add(new Teacher(i + 1, name, classes));
        }

        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String res = "";
            for(int i = 0 ; i < arr.length ; i++){
                res += arr[i].substring(0, 1).toUpperCase() ;
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(Teacher i : list){
                if(i.getClasses().equals(res)){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
