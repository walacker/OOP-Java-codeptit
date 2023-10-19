package mypack;

import java.util.ArrayList;

import Management.CourseManagementStaff;

public class Staff extends User implements CourseManagementStaff {
    public Staff(String username, String password, String firstName, String midName, String lastName) {
        super(username, password, firstName, midName, lastName);
        //TODO Auto-generated constructor stub
    }

    ArrayList<Course> registeredCourses = new ArrayList<Course>();

    @Override
    public void viewallCourse(ArrayList<Course> courses) {
        // TODO Auto-generated method stub
        System.out.println("All Courses");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public void registerCourse(Course course) {
        // TODO Auto-generated method stub
        registeredCourses.add(course);
        course.addFaculty(this.getName());
    }

    @Override
    public void withdraw(Course course) {
        // TODO Auto-generated method stub
        registeredCourses.remove(course);
        course.withdrawFaculty(this.getName());
    }

    @Override
    public void viewCourseOfFaculty() {
        // TODO Auto-generated method stub
        System.out.println("Course of Faculty");
        for (Course course : registeredCourses) {
            System.out.println(course.getCourseName());
        }
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    
}
