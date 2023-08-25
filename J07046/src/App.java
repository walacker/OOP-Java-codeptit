import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    
    public static void main(String[] args) throws Exception , FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ABC> list = new ArrayList<>();
        while(n-->0){
            list.add(ABC.nextAbc(sc));
        }

        list.sort((a, b) -> (int)(b.getDays() - a.getDays()));
        list.forEach(System.out::println);
    }

}

class ABC{
    public static int d = 1;
    private String code,name,room;
    Date in,out;
    
    public ABC() {
    }

    public ABC(String name, String room, Date in, Date out) {
        this.code = "KH" + String.format("%02d", d++) ;
        this.name = name;
        this.room = room;
        this.in = in;
        this.out = out;
    }

    public static ABC nextAbc(Scanner sc) throws ParseException{
        String name = sc.nextLine();
        String room = sc.nextLine();
        Date in =  new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        Date out = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        ABC abc = new ABC(name,room,in,out);
        return abc;
    }

    public long getDays () {
        return TimeUnit.MILLISECONDS.toDays(out.getTime() - in.getTime());
    }
    
    @Override
    public String toString() {
        return code + " " + name + " " + room + " " + getDays();
    }

}
