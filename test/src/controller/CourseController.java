package controller;

import java.util.*;

import mypack.Course;
import mypack.Faculty;
import mypack.Student;

public class CourseController {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Course > courseList = new ArrayList<>();

    public static void addCourseInfo() {
        try {
            System.out.print("ID : ");
            String id = sc.nextLine();
            System.out.print("Name : ");
            String s = sc.nextLine();
            System.out.print("Credit : ");
            int credit = Integer.parseInt(sc.nextLine());
            Course course = new Course(id, s, credit, StudentController.studentList, FacultyController.facultiesList);
            courseList.add(course);
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }


    public static void viewCourseList() {
        courseList.forEach(System.out::println);
    }

    public static void updateCourseList() {
        try {
            System.out.println("Enter course id u want to update : ");
            viewCourseList();
            String id = sc.nextLine();
            for (Course course : courseList) {
                if (course.getId().equals(id)) {
                    System.out.println("Enter new name");
                    String name = sc.nextLine();

                    System.out.println("Enter new credit");
                    Integer credit = Integer.parseInt(sc.nextLine());

                    course.updateCourse(id, name, credit);
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void addTeacherToCourse() {
        try {
            System.out.println("enter course id");
            String id = sc.nextLine();
            for (Course course : CourseController.courseList) {
                if (course.getId().equals(id)) {
                    System.out.println("enter teacher id");
                    String id1 = sc.nextLine();
                    for (Faculty faculty : FacultyController.facultiesList) {
                        if (faculty.getId().equals(id1)) {
                            course.addFacultytoCourse(faculty);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
            System.out.println(e);
        }
    }

    public static void addStudenttoCourse() {
        try {
            System.out.println("enter course id");
            String id = sc.nextLine();
            for (Course course : CourseController.courseList) {
                if (course.getId().equals(id)) {
                    System.out.println("enter student id");
                    String id1 = sc.nextLine();
                    for (Student student : StudentController.studentList) {
                        if (student.getId().equals(id1)) {
                            course.addStudenttoCourse(student);
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
