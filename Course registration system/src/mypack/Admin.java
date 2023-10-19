package mypack;

import java.util.ArrayList;

import Management.CourseManagementAdmin;

public class Admin extends User implements CourseManagementAdmin{

    public Admin(String username, String password, String firstName, String midName, String lastName) {
        super(username, password, firstName, midName, lastName);
        //TODO Auto-generated constructor stub
    }


    @Override
    public void newCourse(ArrayList<Course> courses, Course courseToAdd) {
        // TODO Auto-generated method stub
        System.out.println("New Course");
        courses.add(courseToAdd);
    }

    @Override
    public void deleteCourse(ArrayList<Course> courses, Course courseToRemove) {
        // TODO Auto-generated method stub
        System.out.println("Delete Course");
        courses.remove(courseToRemove);
    }

    @Override
    public void viewAllCourses(ArrayList<Course> courses) {
        // TODO Auto-generated method stub
        System.out.println("All Courses");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public void viewAllFullCourses(ArrayList<Course> courses) {
        // TODO Auto-generated method stub
        System.out.println("All Full Courses");
        for (Course course : courses) {
            if (course.getCurrentStudent() == course.getMaxStudent()) {
                System.out.println(course.getCourseName());
            }
        }
    }

    @Override
    public void viewStudentsInCourse(ArrayList<Course> courses, String courseID, int courseSectionNumber) {
		boolean found = false;
		Course c = null;
		for (int i = 0; i < courses.size() && !found; i++) {
			if (courses.get(i).getCourseId().equals(courseID) && courses.get(i).getCourseSection() == courseSectionNumber) {
				c = courses.get(i);
				found = true;
			
			}
		}
		ArrayList<String> students = c.getListOfStudent();
		for (int i = 0; i< students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

    @Override
    public void viewCoursesOfStudent(Student s) {
        // TODO Auto-generated method stub
        System.out.println("Course of Student");
        for (Course course : s.getRegisteredCourses()) {
            System.out.println(course.getCourseName());
        }
    }

    @Override
    public void displayCourse(ArrayList<Course> courses, String courseID, int courseSectionNumber) {
		Course c1 = null;
		boolean found = false;
		for (int i = 0; i < courses.size() && !found; i++) {
			if (courses.get(i).getCourseId().equals(courseID) && courses.get(i).getCourseSection() == courseSectionNumber) {
				c1 = courses.get(i);
				found = true;
			}
		}
		System.out.println("Course Name:\n"+ c1.getCourseName() + "\nCourse ID:\n" + c1.getCourseId() + "\nMax number of students in course:\n" + c1.getMaxStudent() + "\nCurrent Number of students enrolled:\n"
				+ c1.getCurrentNumberOfStudents() + "\nCourse Section Number:\n" + c1.getCourseSection() + "\nCourse Location:\n" + c1.getCourseLocation() + "\nCourse Instructor:\n" +c1.getCourseInstructor());
	}

    @Override
    public void sortCourses(ArrayList<Course> courses) {
        courses.sort((a,b) -> a.getCourseName().compareTo(b.getCourseName()));
    }

}


