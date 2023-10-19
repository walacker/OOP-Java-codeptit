package mypack;

import java.util.*;

public class Course {
        protected String courseName;
        protected String courseId;
        private int maxStudent;
        private int currentStudent;
        private String courseInstructor;
        private int courseSectionNumber;
        private String courseLocation;
        ArrayList<String > listOfStudent = new ArrayList<String>();
        ArrayList<String > listOfFaculty = new ArrayList<String>();

        public Course(String courseName, String courseId, int maxStudent, int currentStudent, String courseInstructor, int courseSectionNumber, String courseLocation) {
            this.courseName = courseName;
            this.courseId = courseId;
            this.maxStudent = maxStudent;
            this.currentStudent = currentStudent;
            this.courseInstructor = courseInstructor;
            this.courseSectionNumber = courseSectionNumber;
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

        public int getMaxStudent() {
            return maxStudent;
        }

        public void setMaxStudent(int maxStudent) {
            this.maxStudent = maxStudent;
        }

        public int getCurrentStudent() {
            return currentStudent;
        }

        public void setCurrentStudent(int currentStudent) {
            this.currentStudent = currentStudent;
        }

        public ArrayList<String> getListOfStudent() {
            return listOfStudent;
        }

        public void setListOfStudent(ArrayList<String> listOfStudent) {
            this.listOfStudent = listOfStudent;
        }

        public String getCourseInstructor() {
            return courseInstructor;
        }

        public void setCourseInstructor(String courseInstructor) {
            this.courseInstructor = courseInstructor;
        }

        public int getCourseSection() {
            return courseSectionNumber;
        }

        public void setCourseSection(int courseSectionNumber) {
            this.courseSectionNumber = courseSectionNumber;
        }

        public String getCourseLocation() {
            return courseLocation;
        }

        public void setCourseLocation(String courseLocation) {
            this.courseLocation = courseLocation;
        }

        public void addStudent(String studentName) {
            this.listOfStudent.add(studentName);
            this.currentStudent++;
        }

        public void withdrawStudent(String studentName) {
            this.listOfStudent.remove(studentName);
            this.currentStudent--;
        }

        public void addFaculty(String teacherName) {
            this.listOfFaculty.add(teacherName);
        }

        public void withdrawFaculty(String teacherName) {
            this.listOfFaculty.remove(teacherName);
        }

        public ArrayList<String> getListOfFaculty() {
            return listOfFaculty;
        }

        public void setListOfFaculty(ArrayList<String> listOfFaculty) {
            this.listOfFaculty = listOfFaculty;
        }

        public String getCurrentNumberOfStudents() {
            return null;
        }

        
}
