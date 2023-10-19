import java.util.Scanner;

class Staff{
    private String name,sex,dob,adr,phone,date;

    Staff(){
        name = "";
        sex = "";
        dob = "";
        adr = "";
        phone = "";
        date = "";
    }

    Staff(String name,String sex,String dob,String adr,String phone,String date){
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.adr = adr;
        this.phone = phone;
        this.date = date;
    }

    @Override 
    public String toString(){
        return "00001 " + name + " " + sex + " " + dob + " " + adr + " " + phone + " " + date;
    }

}

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String name = sc.nextLine()
        String sex = sc.nextLine();
        String dob = sc.nextLine();   
        String adr = sc.nextLine();
        String phone = sc.nextLine();
        String date = sc.nextLine();   
        Staff staf = new Staff(name, sex, dob, adr, phone, date) ;
        System.out.println(staf);
    }
}
