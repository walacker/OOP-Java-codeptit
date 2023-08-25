import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    public static void main(String[] args)  throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> subjects = new ArrayList<>();
        for(int i = 0;i < n;i++){
            subjects.add(Subject.nextSubject(sc));
        }
        subjects.sort(null);
        for(Subject subject : subjects){
            System.out.println(subject);
        }
    }
}

class Subject implements Comparable<Subject>  {
    private String code,name,number;
    Scanner sc = new Scanner(System.in);

    public Subject() {
        this.code = this.name = this.number = "";
    }

    public static Subject nextSubject(Scanner sc){
        Subject a = new Subject();
        a.code = sc.nextLine();
        a.name = sc.nextLine().trim();
        a.number = sc.nextLine();
        return a;
    }

    public Subject(String code, String name, String number) {
        this.code = code;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + number;
    }

    @Override
    public int compareTo(Subject other) {
        return this.name.compareTo(other.name);
    }
}
