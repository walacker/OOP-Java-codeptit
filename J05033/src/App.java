import java.util.ArrayList;
import java.util.Scanner;

class Time implements Comparable<Time>{
    private int hour,min,sec;

    Time(Integer hour,Integer min,Integer sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int gethour(){
        return hour;
    }

    public int getmin(){
        return min;
    }

    public int getsec(){
        return sec;
    }

    @Override
    public String toString() {
        return hour + " " + min + " " + sec;
    }

    @Override
    public int compareTo(Time other) {
        int t1 = hour * 3600 + min * 60 + sec;
        int t2 = other.gethour() * 3600 + other.getmin() * 60 + other.getsec();
        return t1 - t2 ;
    }
}

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++ ) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            list.add(new Time(hour,minute,second));
        }
        
        list.sort(null);
        for(Time i : list) System.out.println(i);
    }

    public static void main(String[] args) throws Exception {
        Solve();
        sc.close();
    }
}