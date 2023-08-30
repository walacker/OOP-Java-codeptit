///NguyenNhatMinhE21CN4/// 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        while (n-- > 0) {
            students.add(Student.nexStudent(sc));
        }
        students.sort((a,b) -> Double.compare(b.getScore(),a.getScore()));
        students.forEach(System.out::println);
    }
}

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public static Student nexStudent(Scanner sc){
        String name = sc.nextLine();
        Double score = Double.parseDouble(sc.nextLine());
        return new Student(name, score);
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return this.name + " " + this.score;
    }

}
