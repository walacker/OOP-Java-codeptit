///NguyenNhatMinhE21CN4/// 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        while(n-- > 0){
            employees.add(Employee.newEmployee(sc));
        }

        employees.sort((a,b) -> Integer.compare(b.getHours(), a.getHours()));
        employees.forEach(System.out::println);
    }
}

class Employee{
    private int[] days = new int[7];
    private String id;
    public static int d = 1;

    Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    public Employee(int[] days) {
        this.id = String.format("Employee %d", d++);
        this.days = days;
    }

    public static Employee newEmployee(Scanner sc){
        int[] days = new int[7];
        for(int i = 0; i < 7; i++){
            days[i] = sc.nextInt();
        }
        return new Employee(days);
    }

    public int getHours() {
        int hours = 0;
        for(int i = 0; i < 7; i++){
            hours += days[i];
        }
        return hours;
    }

    @Override
    public String toString() {
        return this.id + " " + this.getHours();
    }
}

