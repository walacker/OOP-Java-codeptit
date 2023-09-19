import java.util.*;

import mypack.Address;
import mypack.Course;
import mypack.Faculty;
import mypack.Name;
import mypack.Student;
import mypack.Person;

public class Test {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Course> courseList = new ArrayList<>();
    static ArrayList<Student> studentList = new ArrayList<>();
    static ArrayList<Faculty> facultiesList = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    addStudentInfo();
                    break;
                case 2:
                    addFacultyInfo();
                    break;
                case 3:
                    addCourseInfo();
                    break;
                case 4:
                    viewStudentList();
                    break;
                case 5:
                    viewTeacherList();
                    break;
                case 6:
                    viewCourseList();
                    break;
                case 7:
                    addStudenttoCourse();
                    break;
                case 8:
                    addTeacherToCourse();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 0);
    }

    static void showMenu() {
        System.out.println("""
                1 - Add student information
                2 - Add teacher information
                3 - Add course information
                4 - View student list
                5 - View teacher list
                6 - View course list
                7 - Add student to course
                8 - Add teacher to course
                0 - Exit
                    """);
    }

    static void addStudentInfo() {
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
            System.out.println("duc ngu vcl");
            System.out.println(e);
        }
    }

    static void addFacultyInfo() {
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
            System.out.println("duc ngu vcl");
            System.out.println(e);
        }
    }

    static void addCourseInfo() {
        try {
            System.out.print("ID : ");
            String id = sc.nextLine();
            System.out.print("Name : ");
            String s = sc.nextLine();
            System.out.print("Credit : ");
            int credit = Integer.parseInt(sc.nextLine());
            Course course = new Course(id, s, credit, studentList, facultiesList);
            courseList.add(course);
        } catch (Exception e) {
            System.out.println("duc ngu vcl");
            System.out.println(e);
        }
    }

    static void viewStudentList() {
        for (Student student : studentList) {
            System.out.println(student.getInfo());
        }
    }

    static void viewTeacherList() {
        for (Faculty faculty : facultiesList) {
            System.out.println(faculty.getInfo());
        }
    }

    static void viewCourseList() {
        courseList.forEach(System.out::println);
    }

    private static void addTeacherToCourse() {
        try {
            System.out.println("enter course id");
            String id = sc.nextLine();
            for (Course course : courseList) {
                if (course.getId().equals(id)) {
                    System.out.println("enter teacher id");
                    String id1 = sc.nextLine();
                    for (Faculty faculty : facultiesList) {
                        if (faculty.getId().equals(id1)) {
                            course.addFacultytoCourse(faculty);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("duc ngu vcl");
            System.out.println(e);
        }
    }

    private static void addStudenttoCourse() {
        try {
            System.out.println("enter course id");
            String id = sc.nextLine();
            for (Course course : courseList) {
                if (course.getId().equals(id)) {
                    System.out.println("enter student id");
                    String id1 = sc.nextLine();
                    for (Student student : studentList) {
                        if (student.getId().equals(id1)) {
                            course.addStudenttoCourse(student);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("duc ngu vcl");
            System.out.println(e);
        }

    }
}