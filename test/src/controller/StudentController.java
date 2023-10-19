package controller;

import java.util.*;

import mypack.Address;
import mypack.Course;
import mypack.Name;
import mypack.Student;

public class StudentController {
    
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Student> studentList = new ArrayList<>();

    public static void addStudentInfo() {
        
        System.out.println("Enter the number of student: ");
        try {
            int n = Integer.parseInt(sc.nextLine());
            while (n-- > 0) {
                System.out.print("ID : ");
                String id = sc.nextLine();

                System.out.print("Name : ");
                String s = sc.nextLine();
                Name name = new Name(s);

                System.out.print("Class : ");
                String classes = sc.nextLine();

                System.out.print("Phone number : ");
                String phone = sc.nextLine();

                System.out.println("Address : ");
                System.out.print("Home number : ");
                String homeNo = sc.nextLine();
                System.out.print("Street : ");
                String street = sc.nextLine();
                System.out.print("District : ");
                String district = sc.nextLine();
                System.out.print("City : ");
                String city = sc.nextLine();
                Address address = new Address(homeNo, street, district, city);

                Student student = new Student(id, name, classes, phone, address);
                studentList.add(student);
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void viewStudentList() {
        studentList.forEach(System.out::println);
    }

    public static void updateStudentList() {
        try {
            System.out.println("Enter student id u want to update : ");
            viewStudentList();
            String id = sc.nextLine();
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    System.out.println("Enter new name");
                    String name = sc.nextLine();

                    System.out.println("Enter new class");
                    String classes = sc.nextLine();

                    System.out.println("Enter new phone");
                    String phone = sc.nextLine();

                    System.out.println("Enter new home number");
                    String homeNo = sc.nextLine();
                    System.out.println("Enter new street");
                    String street = sc.nextLine();
                    System.out.println("Enter new district");
                    String district = sc.nextLine();
                    System.out.println("Enter new city");
                    String city = sc.nextLine();
                    student.updateStudent(id, new Name(name), classes, phone,
                            new Address(homeNo, street, district, city));
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void addCourseToStudent() {
        try {
            System.out.println("enter student id");
            String id = sc.nextLine();
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    System.out.println("enter course id");
                    String id1 = sc.nextLine();
                    for (Course course : CourseController.courseList) {
                        if (course.getId().equals(id1)) {
                            student.addCourse(course);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

}
