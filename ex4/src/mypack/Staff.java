package mypack;

import java.util.*;

import Management.CourseManagementStaff;

public class Staff extends User implements CourseManagementStaff {

    ArrayList<Course> registeredCourses = new ArrayList<Course>();

    public Staff(String username, String password, String firstName, String middleName, String lastName) {
        super(username, password, firstName, middleName, lastName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void viewAllCourses(ArrayList<Course> courses) {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).getCourseName());
        }
    }

    @Override
    public void register(Course c1){
        registeredCourses.add(c1);
        c1.registerStudent(firstName + " " + middleName + " " + lastName);
    }

    @Override
    public void withdraw(Course c1){
        registeredCourses.remove(c1);
        c1.withdrawStudent(firstName + " " + middleName + " " + lastName);
    }

    @Override
    public void viewCoursesOfFaculty() {
        for (int i = 0; i < registeredCourses.size(); i++) {
            System.out.println(registeredCourses.get(i).getCourseName());
        }
    }

}
