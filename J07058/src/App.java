import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Subject implements Comparable<Subject>{
    private String name,code,form;

    Subject(String code,String name,String form){
        this.name = name;
        this.code = code;
        this.form = form;

    }

    public String getMaMon(){
        return code;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + form;
    }

    @Override
    public int compareTo(Subject other) {
        return this.code.compareTo(other.getMaMon());
    }
}

public class App {

    public static void Solve(){
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));Solve();
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++ ) {
            String code = sc.nextLine();
            String name = sc.nextLine();
            String form = sc.nextLine();
            list.add(new Subject(code,name,form));
        }
        
        list.sort(null);
        for(Subject i : list) System.out.println(i);
    }
}