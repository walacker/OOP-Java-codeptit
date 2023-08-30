import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Room> list = new ArrayList<>();
        while(n-- > 0){
            list.add(Room.newRoom(sc));
        }

        list.sort((a,b) -> (int)(b.total() - a.total()));
        list.forEach(System.out::println);
    }
}

class Room{
    private String name,room,code;
    Date in,out ;
    private long price;
    public static long count = 1;

    public Room(String name, String room, String in, String out, long price) throws ParseException {
        this.code = String.format("KH%02d", count++);
        this.name = name;
        this.room = room;
        this.in = toDate(in);
        this.out = toDate(out);
        this.price = price;
    }

    public static Room newRoom(Scanner sc) throws ParseException{
        String name = sc.nextLine().trim();
        String room = sc.nextLine().trim();
        String in = sc.nextLine();
        String out = sc.nextLine();
        long price = Long.parseLong(sc.nextLine());
        return new Room(name, room, in, out, price);
    }

    public Date toDate (String s) throws ParseException {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(2) != '/') sb.insert(0, '0');
        if (sb.charAt(5) != '/') sb.insert(3, '0');
        return new SimpleDateFormat("dd/MM/yyyy").parse(sb.toString());
    }

    public String Normalize(){
        String[] s = name.split("\\s+");
        String res = "";
        for (String string : s) {
            res += string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase() + " ";
        }
        return res.trim() ;
    }

    public String Floor(){
        return room.substring(0,1);
    }

    public long price(){
        long res = 0 ; 
        switch(Floor()){
            case "1": res = 25; break;
            case "2": res = 34; break;
            case "3": res = 50; break;
            case "4": res = 80; break;
        }
        return res;
    }

    public long getDay(){
        return TimeUnit.MILLISECONDS.toDays(out.getTime() - in.getTime()) + 1;
    }

    public long total(){
        return price() * getDay() + price ;
    }

    @Override
    public String toString() {
        return code + " " + Normalize() + " " + room + " " + getDay() + " " + total();
    }
}
