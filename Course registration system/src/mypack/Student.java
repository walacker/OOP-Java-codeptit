package mypack;

import java.util.*;

import Management.CourseManagementStudent;

public class Student extends User implements CourseManagementStudent {
    ArrayList<Course> registeredCourses = new ArrayList<Course>();

    public Student(String username, String password, String firstName, String midName, String lastName) {
        super(username, password, firstName, midName, lastName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void viewallCourse(ArrayList<Course> courses) {
        // TODO Auto-generated method stub
        System.out.println("All Courses");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public void viewNotFull(ArrayList<Course> courses) {
        // TODO Auto-generated method stub
        System.out.println("Not Full Courses");
        for (Course course : courses) {
            if (course.getCurrentStudent() < course.getMaxStudent()) {
                System.out.println(course.getCourseName());
            }
        }
    }

    @Override
    public void registerCourse(Course course) {
        // TODO Auto-generated method stub
        if (course.getCurrentStudent() < course.getMaxStudent()) {
            registeredCourses.add(course);
            course.addStudent(this.getName());
        } else {
            System.out.println("Course is full");
        }
    }

    @Override
    public void withdraw(Course course) {
        // TODO Auto-generated method stub
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.withdrawStudent(this.getName());
        } else {
            System.out.println("Course not found");
        }
    }

    @Override
    public void viewCourseOfStudent() {
        // TODO Auto-generated method stub
        System.out.println("Course of Student");
        for (Course course : registeredCourses) {
            System.out.println(course.getCourseName());
        }
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }
}
