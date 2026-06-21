package org.example;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int a) {
        course = a;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

}
