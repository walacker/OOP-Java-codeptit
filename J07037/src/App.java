import java.io.File;
import java.io.FileNotFoundException;
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
        return this.id.compareTo(other.id);
    }
}

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
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
        for(Intern intern : list){
            System.out.println(intern);
        }
    }
}
