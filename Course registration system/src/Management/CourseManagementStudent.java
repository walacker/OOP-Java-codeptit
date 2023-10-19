package Management;

import java.util.*;

import mypack.Course;

public interface CourseManagementStudent {
        public abstract void viewCourseOfStudent();

        public void viewallCourse(ArrayList<Course> courses);

        public void viewNotFull(ArrayList<Course> courses);

        public void registerCourse(Course course);

        public void withdraw(Course course);
}
