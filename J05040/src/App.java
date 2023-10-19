import java.util.*;

public class App {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Staff> list = new ArrayList<>();
    static int count = 1;
    static Long sum = (long) 0;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++){
            String name = sc.nextLine();
            Long salary = Long.parseLong(sc.nextLine());
            Long day = Long.parseLong(sc.nextLine());
            String position = sc.nextLine();
            list.add(new Staff(count++,name,salary,day,position));
            sum += list.get(i).getSum();
        }

        list.forEach(staff -> {
            System.out.println(staff);
        });
        
        //System.out.println("Tong chi phi tien luong: " + sum);
    }
}

class Staff{
    private String code,name , position;
    private Long salary,day;
    private Long reward,allowance,sum;

    public Staff(int count ,String name, Long salary, Long day, String position) {
        this.code = String.format("NV%02d", count);
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.day = day;
        switch (position) {
            case "GD":
                this.allowance = (long) 250000;
                break;
            case "PGD":
                this.allowance = (long) 200000;
                break;
            case "TP":
                this.allowance = (long) 180000;
                break;
            case "NV":
                this.allowance = (long) 150000;
                break;
        }

        this.salary *= this.day;
        
        if(this.day >= 25) this.reward = this.salary / 5;
        else if(this.day >=22) this.reward = this.salary / 10;
        else this.reward = (long) 0;

        this.sum = this.salary + this.reward + this.allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    public Long getReward() {
        return reward;
    }

    public void setReward(Long reward) {
        this.reward = reward;
    }

    public Long getAllowance() {
        return allowance;
    }

    public void setAllowance(Long allowance) {
        this.allowance = allowance;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public String toString(){
        return code + " " + name + " " + " " + salary + " " + reward + " " + allowance + " " + sum;
    }

    
}