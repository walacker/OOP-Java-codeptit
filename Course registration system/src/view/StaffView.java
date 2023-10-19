package view;

import Management.CourseManagementStudent;
import Management.CourseManagementStaff;
import mypack.Course;
import mypack.Student;
import mypack.Staff;
import mypack.User;

import java.util.*;
import java.io.*;
import static view.AdminView.courses;

public class StaffView {
    static Scanner sc = new Scanner(System.in);
    static Staff logginedStaff;

    public static void printStaffMenu() {
        System.out.println("""
                    Staff Main Menu :
                        (1) View all courses
                        (2) Register teaching in a course
                        (3) Withdraw from a course
                        (4) View all courses are registered in
                        (5) Exit
                """);
    }

    public static void mainMenuStaff() {
        printStaffMenu();
        int option;
        boolean validAnswer = false;

        do {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    // view all courses
                    logginedStaff.viewallCourse(courses);
                    printStaffMenu();
                    validAnswer = false;
                    break;

                case 2:
                    // register to course
                    registerStaffToCourseStaff();
                    printStaffMenu();
                    validAnswer = false;
                    break;

                case 3:
                    // withdraw from course
                    withdrawStaffFromCourseStaff();
                    printStaffMenu();
                    validAnswer = false;
                    break;

                case 4:
                    // view all currently enrolled courses
                    logginedStaff.viewCourseOfFaculty();
                    printStaffMenu();
                    validAnswer = false;
                    break;

                case 5:
                    // exit
                    System.out.println("Exiting...");
                    validAnswer = true;
                    break;

                default:
                    System.out.println("Invalid input, please try again.");
                    validAnswer = false;
                    break;
            }

        } while (!validAnswer);
    }

    public static void registerStaffToCourseStaff() {
        System.out.println("Enter the course ID: ");
        String courseID = sc.next();
        System.out.println("Enter the course section number: ");
        int courseSectionNumber = sc.nextInt();
        boolean found = false;
        Course c = null;
        for (int i = 0; i < courses.size() && !found; i++) {
            if (courses.get(i).getCourseId().equals(courseID)
                    && courses.get(i).getCourseSection() == courseSectionNumber) {
                c = courses.get(i);
                found = true;
            }
        }
        if (found) {
            logginedStaff.registerCourse(c);
        } else {
            System.out.println("Course not found.");
        }
    }

    public static void withdrawStaffFromCourseStaff() {
        System.out.println("Enter the course ID: ");
        String courseID = sc.next();
        System.out.println("Enter the course section number: ");
        int courseSectionNumber = sc.nextInt();
        boolean found = false;
        Course c = null;
        for (int i = 0; i < courses.size() && !found; i++) {
            if (courses.get(i).getCourseId().equals(courseID)
                    && courses.get(i).getCourseSection() == courseSectionNumber) {
                c = courses.get(i);
                found = true;
            }
        }
        if (found) {
            logginedStaff.withdraw(c);
        } else {
            System.out.println("Course not found.");
        }
    }

}
