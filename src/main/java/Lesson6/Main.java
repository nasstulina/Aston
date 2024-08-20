package Lesson6;

import java.lang.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1. Создание класса \"Сотрудник\".");
        Employee employee1 = new Employee("Mishustina Anastasia Dmitrievna",
                "Specialist-expert", "n.mishustina44@gmail.com",
                "+79293783871", 40000, 24);
        employee1.info();

        System.out.println("Задание №2");
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Teacher","ivivan@gmail.com", "89643254125", 45000, 34 );
        persArray[1] = new Person("Ivannov Egor", "Doctor", "innegor@mail.ru", "89843453361", 25000, 23);
        persArray[2] = new Person("Egorov Ivan", "Engineer", "egorov@bk.ru", "89359862435", 35000, 26);
        persArray[3] = new Person("Petrov Igor", "Mechanic", "petrov23@gmail.com", "83457682539", 40000, 42);
        persArray[4] = new Person("Sidorov Petr", "Engineer", "sidpetr1995@gmail.com", "89321253684", 45000, 48);
        System.out.println(Arrays.deepToString(persArray));

        System.out.println("\nЗадание №3. Создание класса \"Park\" c вложенным классом.");
        Park.infoAttraction park1 = new Park("Happines", 15,
                "all season").new infoAttraction("10:00-20:00", 5,
                12, 15);
        System.out.println("Название аттракциона: " + park1.getName() + "\nСезон работы: " + park1.getWorkSeason() +
                "\nНомер аттракциона в  парке: " + park1.getNumberAttractions() +
                "\nВремя работы: " + park1.getWorkTime() + "\nЦена: " + park1.getPrice() +
                "\nВозрастное ограничение: " + park1.getAgeRestriction() +
                "\nВместимость человек: " + park1.getCapacity());
    }
    //Задание №2
        public static class Person {
            String fullNamePerson;
            String postPerson;
            String emailPerson;
            String phoneNumberPerson;
            int salaryPerson;
            int agePerson;

            public Person(String fullNamePerson, String postPerson, String emailPerson,
                          String phoneNumberPerson, int salaryPerson, int agePerson) {
                this.fullNamePerson = fullNamePerson;
                this.postPerson = postPerson;
                this.emailPerson = emailPerson;
                this.phoneNumberPerson = phoneNumberPerson;
                this.salaryPerson = salaryPerson;
                this.agePerson = agePerson;
            }
        }
}

