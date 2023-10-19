package view;

import Management.CourseManagementStudent;
import Management.CourseManagementAdmin;
import Management.CourseManagementStaff;
import mypack.Admin;
import mypack.Course;
import mypack.Student;
import mypack.Staff;
import mypack.User;

import java.util.*;
import java.io.*;

public class AdminView {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Staff> faculties = new ArrayList<Staff>();
    static Admin admin = new Admin("Admin", "Admin001", "Nguyen", "Nhat", "Minh");

    public static void printMainMenuAdmin(){
        System.out.println("""
                Admin Main Menu :
                    (1) Course Managment
                    (2) Reports
                    (3) Exit
                """);
    }

    public static void printCourseManagementMenuAdmin(){
        System.out.println("""
                Course Management Menu :
                    (1) Create a new course
                    (2) Delete a course
                    (3) Edit a course
                    (4) Display information for a given course
                    (5) Register a student
                    (6) Exit
                """);
    }

    static void courseManagementMenuAdmin() {
		printCourseManagementMenuAdmin();
		int command;
		boolean validAnswer = false;

		do {
			command = sc.nextInt();
			switch (command) {
			case 1: // creates a new course
				createNewCourseAdmin();
				printCourseManagementMenuAdmin();
				validAnswer = false;
				break;

			case 2: // delete course
				deleteCourseAdmin();
				printCourseManagementMenuAdmin();
				validAnswer = false;
				break;

			case 3: // edit course
				editCourseAdmin();
				printCourseManagementMenuAdmin();
				validAnswer = false;
				break;

			case 4: // display info of course
				displayCourseInfoAdmin();
				printCourseManagementMenuAdmin();
				validAnswer = false;
				break;

			case 5: // register a student
				registerStudentToDataBaseAdmin();
				printCourseManagementMenuAdmin();
				validAnswer = false;
				break;
			case 6:
				System.out.println("Exiting...");
				printMainMenuAdmin();
				// save
				validAnswer = true;
				break;
			default:
				System.out.println("Not a valid command, please enter 1-3");
				validAnswer = false;
				break;
			}
		} while (!validAnswer);
	}

	static void displayCourseInfoAdmin() {
		System.out.println("Enter courseID: ");
		String ID = sc.next();
		System.out.println("Enter Course Section Number: ");
		int sectionNumber = sc.nextInt();

		admin.displayCourse(courses, ID, sectionNumber);

	}

	static void deleteCourseAdmin() {
		System.out.println("Enter courseID: ");
		String ID = sc.next();
		System.out.println("Enter Course Section Number: ");
		int sectionNumber = sc.nextInt();
		Course c = null;
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getCourseId().equals(ID) && courses.get(i).getCourseSection() == sectionNumber) {
				c = courses.get(i);
			}
		}
		admin.deleteCourse(courses, c);
	}

	static void editCourseAdmin() {
		Course currentCourse = null;

		System.out.println("Enter courseID: ");
		String ID = sc.next();
		System.out.println("Enter Course Section Number: ");
		int sectionNumber = sc.nextInt();
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getCourseId().equals(ID) && courses.get(i).getCourseSection() == sectionNumber) {
				currentCourse = courses.get(i);
			}
		}
		sc.nextLine();
		System.out.println("Enter the new Max Number Of Students: (Enter '-' to not change)");
		String answer = sc.nextLine();
		int maxNumStudents = 0;
		if (!answer.equals("-")) {
			maxNumStudents = Integer.parseInt(answer);
			currentCourse.setMaxStudent(maxNumStudents);
		}

		System.out.println("Enter the new Current Number Of Students: (Enter '-' to not change)");
		answer = sc.nextLine();
		int currentNumStudents = 0;
		if (!answer.equals("-")) {
			currentNumStudents = Integer.parseInt(answer);
			currentCourse.setCurrentStudent(currentNumStudents);
		}

		System.out.println("Enter the new instructor: (Enter '-' to not change)");
		answer = sc.nextLine();
		String instructor = "";
		if (!answer.equals("-")) {
			instructor = answer;
			currentCourse.setCourseInstructor(instructor);
		}
		System.out.println("Enter the new section number: (Enter '-' to not change)");
		answer = sc.nextLine();
		int sectionNumber1 = 0;
		if (!answer.equals("-")) {
			sectionNumber1 = Integer.parseInt(answer);
			currentCourse.setCourseSection(sectionNumber1);
		}
		System.out.println("Enter the new location: (Enter '-' to not change)");
		answer = sc.nextLine();
		String location = "";
		if (!answer.equals("-")) {
			location = answer;
			currentCourse.setCourseLocation(location);
		}

	}


    public static void printReportMenuAdmin() {
        System.out.println("""
                Admin Report Main Menu :
                    (1) View all courses
                    (2) View all full courses (only display id and name)
                    (3) View names of students registered to specific course
                    (4) View list of courses a student is registered in
                    (5) Sort courses on current # of students registered
                    (6) Exit
                """);
    }

    static void createNewCourseAdmin() {
		sc.nextLine();// clearing the buffer
		System.out.println("Enter course name: ");
		String name = sc.nextLine();
		System.out.println("Enter courseID: ");
		String ID = sc.next();
		System.out.println("Enter Max Number of Students: ");
		int maxNumOfStudents = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Instructor: ");
		String profName = sc.nextLine();
		System.out.println(profName);
		System.out.println("Enter Section Number: ");
		int sectionNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Location of Course: ");
		String location = sc.nextLine();
		Course c = new Course(name, ID, maxNumOfStudents, 0, profName, sectionNumber, location);
		admin.newCourse(courses, c);
	}

    static void registerStudentToDataBaseAdmin() {
		System.out.println("Register Student Menu");
		System.out.println("Enter Student First Name: ");
		String firstName = sc.next();
        System.out.println("Enter Student Mid Name: ");
        String midName = sc.next();
		System.out.println("Enter Student Last Name: ");
		String lastName = sc.next();
		System.out.println("Enter Username for Student: ");
		String userName = sc.next();
		System.out.println("Enter Password for Student: ");
		String password = sc.next();
		Student s = new Student(userName, password, firstName, midName, lastName);
		students.add(s);
	}



}
