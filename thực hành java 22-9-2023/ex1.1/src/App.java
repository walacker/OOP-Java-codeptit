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
    private String code,name,sex,status; 
    private Double points;
    static Scanner sc = new Scanner(System.in);

    public Sinhvien(String code,String name,String sex,Double points){
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.points = points;
    }

    public Sinhvien() {
        this.code = "";
        this.name = "";
        this.sex = "";
        this.points = 0.0;
        this.status = "";
    }

    public void input(){
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.sex = sc.nextLine().toLowerCase();
        this.points = Double.parseDouble(sc.nextLine());
        String check = "true";
        if(this.sex.equals(check)) this.sex = "nam";
        else this.sex = "nu";
        if(this.points >= 5) this.status = "dat";
        else this.status = "hoc lai";
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
    public Double getPoints() {
        return points;
    }
    public void setPoints(Double points) {
        this.points = points;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {    
        return status;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + sex + " " + status ;
    }
}
