import java.util.*;

import controller.CourseController;
import controller.FacultyController;
import controller.StudentController;
import mypack.Course;
import mypack.Faculty;
import mypack.Student;

public class Main {
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
                case 1 :
                    Studentvoid();
                    break;
                case 2 :
                    Facultyvoid();
                    break;
                case 3 : 
                    Coursevoid();
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 0);
    }

    static void showMenu() {
        System.out.println("""
                1 - Student
                2 - Faculty
                3 - Course
                """);
    }

    static void Studentvoid(){
        int option;
        do {
            showStudentMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    StudentController.addStudentInfo();
                    break;
                case 2:
                    StudentController.viewStudentList();
                    break;
                case 3:
                    StudentController.updateStudentList();
                    break;
                case 4:
                    StudentController.addCourseToStudent();
                    break;
                default:
                    System.out.println("Exit back to select");
                    break;
            }
        } while (option != 0);
    }

    static void Facultyvoid(){
        int option;
        do {
            showFacultyMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    FacultyController.addFacultyInfo();
                    break;
                case 2:
                    FacultyController.viewTeacherList();
                    break;
                case 3:
                    FacultyController.updateTeacherList();
                    break;
                case 4:
                    FacultyController.addCoursetoFaculty();
                    break;
                default:
                    System.out.println("Exit back to select");
                    break;
            }
        } while (option != 0);
    }

    static void Coursevoid(){
        int option;
        do {
            showCourseMenu();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    CourseController.addCourseInfo();
                    break;
                case 2:
                    CourseController.viewCourseList();
                    break;
                case 3:
                    CourseController.updateCourseList();
                    break;
                case 4:
                    CourseController.addStudenttoCourse();
                    break;
                case 5:
                    CourseController.addTeacherToCourse();
                    break;
                default:
                    System.out.println("Exit back to select");
                    break;
            }
        } while (option != 0);
    }

    static void showStudentMenu(){
        System.out.println("""
                1 - Add student information
                2 - View student list
                3 - Update student information
                4 - Add course to student
                0 - Go back to select
                """);
    }

    static void showFacultyMenu(){
        System.out.println("""
                1 - Add teacher information
                2 - View teacher list
                3 - Update teacher information
                4 - Add course to faculty
                0 - Go back to select
                """);
    }

    static void showCourseMenu(){
        System.out.println("""
                1 - Add course information
                2 - View course list
                3 - Update course information
                4 - Add student to course
                5 - Add teacher to course
                0 - Go back to select
                """);
    }
}