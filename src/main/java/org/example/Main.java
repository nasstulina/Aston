package org.example;


import java.util.*;

public class Main {
    public static void removeStudent(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3.0){
                iterator.remove();
            }
        }
        System.out.println(students);
    }

    public static void promoteStudent(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() >= 3.0){
                s.setCourse(s.getCourse() + 1);
            }
        }
        System.out.println(students);
    }

    public static void printStudents(Set<Student> students, int course){
        for (Student s : students){
            if (s.getCourse() == course){
                System.out.println(s.getName());
            }

        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Алексей", 121, 1, Arrays.asList(2, 3, 4, 5));
        Student student2 = new Student("Иван", 121, 1, Arrays.asList(4,4,5,4));
        Student student3 = new Student("Анна", 120, 2, Arrays.asList(3,3,3));
        Student student4 = new Student("Василиса", 120, 2, Arrays.asList(2,3,2,3,2));
        Student student5 = new Student("Пётр", 119, 3, Arrays.asList(5, 4, 4, 5, 5, 5));

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        printStudents(students, 1);

        promoteStudent(students);

        removeStudent(students);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Mishustina", "+79831740750");
        phoneBook.add("Mishustina", "+79293783872");

        System.out.println(phoneBook.get("Mishustin"));

    }
}
