import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            String name = sc.nextLine();
            int AC = sc.nextInt();
            int sub = sc.nextInt();
            list.add(new Student(name, AC, sub));
        }

        list.sort((a,b) -> a.getAC() == b.getAC() ? (a.getSub() == b.getSub() ? a.getName().compareTo(b.getName()) : a.getSub() - b.getSub()) : a.getAC() - b.getAC());
        

        list.forEach(student -> {
            System.out.println(student);
        });
    }
}

class Student{
    private String name;
    private int AC,sub;

    public Student(String name, int aC, int sub) {
        this.name = name;
        this.AC = aC;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int aC) {
        AC = aC;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return name + " " + AC + " " + sub;
    }
    
}
