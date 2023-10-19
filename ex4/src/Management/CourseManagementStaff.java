package Management;

import java.util.*;

import mypack.Course;

public interface CourseManagementStaff {
	public abstract void viewCoursesOfFaculty();
	void viewAllCourses(ArrayList<Course> courses);
	void register(Course c1);
	void withdraw(Course c1);

}
