import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.text.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Time> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(Time.getTime(sc));
        }

        list.sort((a,b) -> {
            if(a.getontime() != b.getontime())
                return (int)(b.getontime() - a.getontime());
            return a.getName().compareTo(b.toString());
        });

        list.forEach(System.out::println);
    }
}

class Time{
    private String name , in , out ;
    private long ontime ;
    
    public Time(String name , String in , String out) throws ParseException{
        this.name = name;
        this.in = in;
        this.out = out;
        this.ontime = getDiff() ;
    }

    public static Time getTime(Scanner sc) throws ParseException{
        String name = sc.nextLine();
        String in = sc.nextLine();
        String out = sc.nextLine();
        return new Time(name , in , out);
    }

    public Date getTime(String s) throws ParseException{
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(s) ;
    }

    public long getDiff() throws ParseException{
        long time = getTime(out).getTime() - getTime(in).getTime();
        return TimeUnit.MILLISECONDS.toMinutes(time) ;
    }

    public String getName(){
        return this.name ;
    }
    
    public long getontime(){
        return this.ontime ;
    }

    @Override
    public String toString() {
        return name + " " + ontime ;
    }
}
