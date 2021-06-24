package com.pro.wings;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private Address studentAddress;
    private List<String> subjects;
    private Set<Integer> marks;
    private Map<String,Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Set<Integer> getMarks() {
        return marks;
    }

    public void setMarks(Set<Integer> marks) {
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Setting student id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setting student name");
        this.studentName = studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, Address studentAddress, List<String> subjects, Set<Integer> marks, Map<String, Integer> map) {
        System.out.println("constructor called!!!");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.subjects = subjects;
        this.marks = marks;
        this.map = map;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", subjects=" + subjects +
                ", marks=" + marks +
                ", map=" + map +
                '}';
    }
}
