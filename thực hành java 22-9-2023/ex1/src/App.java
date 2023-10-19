import java.util.*;

public class App {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }

}

class Sinhvien{
    private String code,name,sex,status = ""; 
    private int points;
    static Scanner sc = new Scanner(System.in);

    public Sinhvien(String code,String name,String sex,int points){
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.points = points;
    }

    public Sinhvien() {
        this.code = "";
        this.name = "";
        this.sex = "";
        this.points = 0;
        this.status = "";
    }

    public void input(){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.sex = sc.nextLine().toLowerCase();
        this.points = Integer.parseInt(sc.nextLine());
    }

    public void out(){
        System.out.println(this.toString());
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        String check = "true";
        if(this.sex.equals(check)) this.status = "nam";
        else this.status = "nu";
        if(this.points >= 5) this.status += " dat";
        else this.status += " hoc lai";
        return status;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + status ;
    }
}
