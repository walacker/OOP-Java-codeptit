import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Intern implements Comparable<Intern>{
    private String id,name;
    private int target;

    public Intern(String id, String name, int target){
        this.id = id;
        this.name = name;
        this.target = target;
    }

    public String getId(){
        return this.id;
    }

    public int getTarget(){
        return this.target;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + target;
    }

    @Override
    public int compareTo(Intern other){
        int cmp = (this.getTarget() - other.getTarget());
            if(cmp != 0) 
                return (int) (other.getTarget() - this.getTarget());
            return (this.getId().compareTo(other.getId()));
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = Integer.parseInt(sc.nextLine());
        List<Intern> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int target = Integer.parseInt(sc.nextLine());
            Intern intern = new Intern(id, name, target);
            list.add(intern);
        }

        list.sort(null);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(Intern intern : list){
                if(intern.getTarget() >= a && intern.getTarget() <= b){
                    System.out.println(intern);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
