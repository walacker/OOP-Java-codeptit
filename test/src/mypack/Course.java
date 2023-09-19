package mypack;

import java.util.*;

public class Course {
    private String id, name;
    private Integer credit;
    ArrayList<Student> studentList;
    ArrayList<Faculty> facultiesList;

    public Course(String id, String name, Integer credit, ArrayList<Student> studentList, ArrayList<Faculty> facultiesList) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.studentList = new ArrayList<>();
        this.facultiesList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public ArrayList<Student> getStudentlist() {
        return studentList;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentList = studentlist;
    }

    public ArrayList<Faculty> getFacultieslist() {
        return facultiesList;
    }

    public void setFacultieslist(ArrayList<Faculty> facultieslist) {
        this.facultiesList = facultieslist;
    }

    public void addStudenttoCourse(Student student) {
        this.studentList.add(student);
    }

    public void addFacultytoCourse(Faculty faculty) {
        this.facultiesList.add(faculty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course ID: ").append(this.id).append("\n");
        sb.append("Course Name:").append(this.name).append("\n");
        sb.append("Course Credits:").append(this.credit).append("\n");
        sb.append("Student Enrolled:\n");
        for (Student student : studentList) {
            sb.append(" - ").append(student.getInfo() + "\n");
        }
        sb.append("Teacher for the Course:\n");
        for (Faculty faculty : facultiesList) {
            sb.append(" - ").append(faculty.getInfo() + "\n");
        }
        return sb.toString();
    }
}