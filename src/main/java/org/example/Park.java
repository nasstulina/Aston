package org.example;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo(){
            System.out.println("Название аттракциона: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + price);
        }
    }

    public static void main(String[] args) {
        Park.Attraction attraction1 = new Park().new Attraction(
                "Американские горки",
                "10:00-20:00",
                3.99);

        attraction1.printInfo();
    }
}
