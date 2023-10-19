package view;

import Management.CourseManagementStudent;
import Management.CourseManagementStaff;
import mypack.Course;
import mypack.Student;
import mypack.Staff;
import mypack.User;

import java.util.*;

import static view.AdminView.courses;

import java.io.*;

public class StudentView {
    static Scanner sc = new Scanner(System.in);
    static Student logginedStudent;

    public static void printStudentMenu() {
        System.out.println("""
                    Student Main Menu :
                        (1) View all courses
                        (2) View all courses that are NOT full
                        (3) Register for a course
                        (4) Withdraw from a course
                        (5) View all courses are registered in
                        (6) Exit
                """);
    }

    public static void mainMenuStudent() {
        printStudentMenu();
        int option;
        boolean validAnswer = false;

        do {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    // view all courses
                    logginedStudent.viewallCourse(courses);
                    printStudentMenu();
                    validAnswer = false;
                    break;

                case 2:
                    // view all open courses
                    logginedStudent.viewNotFull(courses);
                    printStudentMenu();
                    validAnswer = false;
                    break;

                case 3:
                    // register to course
                    registerStudentToCourseStudent();
                    printStudentMenu();
                    validAnswer = false;
                    break;

                case 4:
                    // withdraw from course
                    withdrawStudentFromCourseStudent();
                    printStudentMenu();
                    validAnswer = false;
                    break;
                case 5:
                    // view all courses student is registered in
                    logginedStudent.viewCourseOfStudent();
                    printStudentMenu();
                    validAnswer = false;
                    break;

                case 6:
                    System.out.println("Exiting...");
                    validAnswer = true;
                    break;

                default:
                    System.out.println("Not a valid command, please enter 1-3");
                    printStudentMenu();
                    validAnswer = false;
                    break;
            }
        } while (!validAnswer);
    }

    public static void registerStudentToCourseStudent() {
        System.out.println("Enter the course ID");
        String courseID = sc.next();
        System.out.println("Enter the course section number");
        int courseSectionNumber = sc.nextInt();
        boolean found = false;
        Course c = null;
        for (int i = 0; i < courses.size() && !found; i++) {
            if (courses.get(i).getCourseId().equals(courseID) && courses.get(i).getCourseSection() == courseSectionNumber) {
                c = courses.get(i);
                found = true;
            }
        }
        if (found) {
            logginedStudent.registerCourse(c);
        } else {
            System.out.println("Course not found");
        }
    }

    public static void withdrawStudentFromCourseStudent(){
        System.out.println("Enter the course ID");
        String courseID = sc.next();
        System.out.println("Enter the course section number");
        int courseSectionNumber = sc.nextInt();
        boolean found = false;
        Course c = null;
        for (int i = 0; i < courses.size() && !found; i++) {
            if (courses.get(i).getCourseId().equals(courseID) && courses.get(i).getCourseSection() == courseSectionNumber) {
                c = courses.get(i);
                found = true;
            }
        }
        if (found) {
            logginedStudent.withdraw(c);
        } else {
            System.out.println("Course not found");
        }
    }
}
