import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Staff implements Comparable<Staff>{
    private String code,name,sex,dob,adr,phone,date;

    Staff(){
        name = "";
        sex = "";
        dob = "";
        adr = "";
        phone = "";
        date = "";
    }

    Staff(int t,String name,String sex,String dob,String adr,String phone,String date){
        this.code = String.format("%05d", t);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.adr = adr;
        this.phone = phone;
        this.date = date;
    }

    public int getYear(){
        String s = this.dob;
        return 1000 * (s.charAt(6) - 48) + 100 * (s.charAt(7) - 48) + 10 * (s.charAt(8) - 48) + s.charAt(9) - 48;
    }
    public int getMonth(){
        String s = this.dob;
        return 10 * (s.charAt(3) - 48) + s.charAt(4) - 48;
    }
    public int getDay(){
        String s = this.dob;
        return 10 * (s.charAt(0) - 48) + s.charAt(1) - 48;
    }

    @Override 
    public String toString(){
        return code + " " + name + " " + sex + " " + dob + " " + adr + " " + phone + " " + date;
    }

    @Override 
    public int compareTo(Staff other){
        if(this.getYear() != other.getYear())
                    return (int) (this.getYear() - other.getYear());
                
                if(this.getMonth() != other.getMonth())
                    return (int) (this.getMonth() - other.getMonth());
                
                return (int)(this.getDay() - other.getDay());
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int t = Integer.parseInt(sc.nextLine());
        List<Staff> list = new ArrayList<>();
        for(int i = 0 ; i < t ; i++){
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String dob = sc.nextLine();   
            String adr = sc.nextLine();
            String phone = sc.nextLine();
            String date = sc.nextLine();   
            list.add(new Staff(i+1,name, sex, dob, adr, phone, date)) ;
        }

        list.sort(null);
        for(Staff i : list)
            System.out.println(i);
    }
    
    public static void main(String[] args) throws Exception {
        Solve();
    }
}
