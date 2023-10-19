package mypack;

import java.util.*;

public class Course{
    String courseName;
    String courseId;
    int maxStudents;
    int currentStudents;
    ArrayList<String> studentsList = new ArrayList<String>();
    ArrayList<String> facultyList = new ArrayList<String>();
    String courseInstructor;
    int courseSection;
    String courseLocation;
    public int maxStudentsInCourse;

    public Course(String courseName, String courseId, int maxStudents, String courseInstructor, int courseSection, String courseLocation){
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxStudents = maxStudents;
        this.courseInstructor = courseInstructor;
        this.courseSection = courseSection;
        this.courseLocation = courseLocation;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public void setCurrentStudents(int currentStudents) {
        this.currentStudents = currentStudents;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(int courseSection) {
        this.courseSection = courseSection;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public void updateCourse(String courseName, String courseId, int maxStudents, String courseInstructor, int courseSection, String courseLocation){
        this.setCourseName(courseName);
        this.setCourseId(courseId);
        this.setMaxStudents(maxStudents);
    }


    public int getMaxStudentsInCourse() {
        return maxStudentsInCourse;
    }

    public void setMaxStudentsInCourse(int maxStudentsInCourse) {
        this.maxStudentsInCourse = maxStudentsInCourse;
    }

    public void registerStudent(String name) { //add first name and last name
		studentsList.add(name);
		currentStudents++;
	}
	
	public void withdrawStudent(String name) {
		studentsList.remove(name);
		currentStudents--;
	}

    public void registerFaculty(String name){
        facultyList.add(name);
    }

    public void withdrawFaculty(String name){
        facultyList.remove(name);
    }

    public ArrayList<String> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<String> studentsList) {
        this.studentsList = studentsList;
    }

    public ArrayList<String> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<String> facultyList) {
        this.facultyList = facultyList;
    }

    
}