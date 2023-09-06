import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Subject> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Subject s = Subject.getSubject(sc);
            if (s.getth().equals("Truc tuyen") || s.getth().matches(".*\\.ptit\\.edu\\.vn$"))
                list.add(s);
        }
        list.sort((a,b) -> a.getCode().compareTo(b.getCode()));
        list.forEach(System.out::println);
    }
}

class Subject{
    private String code,name,number,lt,th;

    public Subject(String code, String name, String number, String lt, String th) {
        this.code = code;
        this.name = name;
        this.number = number;
        this.lt = lt;
        this.th = th;
    }

    public static Subject getSubject(Scanner sc){
        String code = sc.nextLine();
        String name = sc.nextLine();
        String number = sc.nextLine();
        String lt = sc.nextLine();
        String th = sc.nextLine();
        return new Subject(code,name,number,lt,th);
    }

    public String getCode() {
        return this.code;
    }

    public String getth(){
        return this.th;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.number + " " + this.lt + " " + this.th;
    }
}
