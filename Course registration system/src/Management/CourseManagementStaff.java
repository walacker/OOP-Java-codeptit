package Management;

import java.util.*;

import mypack.Course;

public interface CourseManagementStaff {
        public abstract void viewCourseOfFaculty();

        public void viewallCourse(ArrayList<Course> courses);

        public void registerCourse(Course course);

        public void withdraw(Course course);
}
