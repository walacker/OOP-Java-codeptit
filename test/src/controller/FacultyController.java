package controller;

import java.util.*;

import mypack.Address;
import mypack.Course;
import mypack.Faculty;
import mypack.Name;

public class FacultyController {
    
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Faculty> facultiesList = new ArrayList<>();

    public static void addFacultyInfo() {
        try {
            System.out.println("Enter the number of teacher: ");
            int n = Integer.parseInt(sc.nextLine());
            while (n-- > 0) {
                System.out.print("ID : ");
                String id = sc.nextLine();

                System.out.print("Name : ");
                String s = sc.nextLine();
                Name name = new Name(s);

                System.out.print("Position : ");
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

                Faculty faculty = new Faculty(id, name, classes, phone, address);
                facultiesList.add(faculty);
            }

        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void viewTeacherList() {
        facultiesList.forEach(System.out::println);
    }

    public  static void updateTeacherList() {
        try {
            System.out.println("Enter teacher id u want to update : ");
            viewTeacherList();
            String id = sc.nextLine();
            for (Faculty faculty : facultiesList) {
                if (faculty.getId().equals(id)) {
                    System.out.println("Enter new name");
                    String name = sc.nextLine();

                    System.out.println("Enter new position");
                    String position = sc.nextLine();

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
                    faculty.updateTeachcer(id, new Name(name), position, phone,
                            new Address(homeNo, street, district, city));
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void addCoursetoFaculty() {
        try {
            System.out.println("enter teacher id");
            String id = sc.nextLine();
            for (Faculty faculty : FacultyController.facultiesList) {
                if (faculty.getId().equals(id)) {
                    System.out.println("enter course id");
                    String id1 = sc.nextLine();
                    for (Course course : CourseController.courseList) {
                        if (course.getId().equals(id1)) {
                            faculty.addCourse(course);
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
