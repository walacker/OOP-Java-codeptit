///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter name, age and salary:");

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
