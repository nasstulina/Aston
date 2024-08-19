package Lesson6;

public class Employee{

    String fullName;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String post, String email, String phoneNumber,
                    int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Full name: " + fullName + "\nPost: " + post +
                "\nE-mail: " + email + "\nPhone number: " + phoneNumber
                + "\nSalary: " + salary + "\nAge: " + age);
        }
}
