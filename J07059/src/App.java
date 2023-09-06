import java.util.*;
import java.io.*;
import java.text.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Shift> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(Shift.newShift(sc));
        }

        list.sort((a,b) -> {
            try {
                return a.toDate().equals(b.toDate()) ? a.getcode().compareTo(b.getcode()) : a.toDate().compareTo(b.toDate()) ;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return 0;
        });
        list.forEach(System.out::println);
    }
}

class Shift{
    private String code,room,time;
    public static int dem = 1;
    
    public Shift(String time,String room){
        this.room = room;
        this.time = time;
        this.code = String.format("C%03d",dem++);
    }

    public static Shift newShift(Scanner sc){
        String d = sc.nextLine();
        String h = sc.nextLine();
        String time = d + " " + h ;
        String room = sc.nextLine();
        return new Shift(time,room);
    }

    public Date toDate() throws ParseException{
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(time);
    }

    public String getcode(){
        return this.code;
    }

    @Override
    public String toString(){
        return code + " " + time + " " + room ;
    }
}