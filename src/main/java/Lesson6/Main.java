package Lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1. Создание класса \"Сотрудник\".");
        Employee employee1 = new Employee("Mishustina Anastasia Dmitrievna",
                "Specialist-expert", "n.mishustina44@gmail.com",
                "+79293783871", 40000, 24);
        employee1.info();

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
        /*public class Person{
            String fullNamePerson;
            String postPerson;
            String emailPerson;
            String phoneNumberPerson;
            int salaryPerson;
            int agePerson;
        }
        public Person(String fullNamePerson, String postPerson, String emailPerson,
                String phoneNumberPerson, int salaryPerson, int agePerson) {
            this.fullNamePerson = fullNamePerson;
            this.postPerson = postPerson;
            this.emailPerson = emailPerson;
            this.phoneNumberPerson = phoneNumberPerson;
            this.salaryPerson = salaryPerson;
            this.agePerson = agePerson;
        }
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivannov Ivan", "Engineer", "89243733871", 30000, 30);
        persArray[1] = new Person("Ivannov Egor", "Engineer", "89243733871", 45000, 25);
        persArray[2] = new Person("Egorov Ivan", "Engineer", "89243733871", 55200, 35);
        persArray[3] = new Person("Petrov Igor", "Engineer", "89243733871", 25000, 40);
        persArray[4] = new Person("Sidorov Petr", "Engineer", "89243733871", 60000, 45);
    }
        public void infoPerson() {
            System.out.println("Full name: " + fullNamePerson + "\nPost: " + postPerson +
            "\nE-mail: " + emailPerson + "\nPhone number: " + phoneNumberPerson
            + "\nSalary: " + salaryPerson + "\nAge: " + agePerson);*/
}

