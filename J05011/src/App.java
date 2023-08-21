import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Gamer implements Comparable<Gamer> {
    private String name , code , in , out;

    Gamer(String name , String code , String in , String out){
        this.name = name;
        this.code = code;
        this.in = in;
        this.out = out;
    }

    public String getcode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getHour(){
        return (Integer.valueOf(this.out.substring(0, 2)) - Integer.valueOf(this.in.substring(0, 2)));
    }

    public int getMinute(){
        return (Integer.valueOf(this.out.substring(3)) - Integer.valueOf(this.in.substring(3)));
    }

    @Override
    public String toString() {
        int h = getHour() , m = getMinute();
        m = 60 * h + m;
        h = m / 60;
        m = m % 60;
        return name + " " + code + " " + String.format(" %d gio %d phut", h , m);
    }

    @Override
    public int compareTo(Gamer other) {
         if(this.getHour() != other.getHour())
                    return (int) (other.getHour() - this.getHour());
                return (int) (other.getMinute() - this.getMinute());
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        List<Gamer> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String name = sc.nextLine();
            String code = sc.nextLine();
            String in = sc.nextLine();
            String out = sc.nextLine();
            list.add(new Gamer(name , code , in , out));
        }   

        list.sort(null);
        for(Gamer x : list){
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Solve();
    }
}
