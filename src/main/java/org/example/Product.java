package org.example;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name,
                   String productionDate,
                   String manufacturer,
                   String countryOfOrigin,
                   double price,
                   boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование: " + isReserved);
    }

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                true);

        productsArray[1] = new Product("iPhone 16 Pro",
                "15.03.2025",
                "Apple Inc.",
                "USA",
                7999.9,
                false);

        productsArray[2] = new Product("Xiaomi 14T",
                "20.04.2025",
                "Xiaomi Corporation",
                "China",
                3999,
                true);

        productsArray[3] = new Product("Google Pixel 9",
                "10.05.2025",
                "Google LLC",
                "USA",
                6599,
                false);

        productsArray[4] = new Product("OnePlus 12",
                "05.06.2025",
                "OnePlus Technology",
                "China",
                4999.9,
                true);


        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println();
        }
    }
}