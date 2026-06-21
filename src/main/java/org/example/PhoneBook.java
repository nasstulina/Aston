package org.example;

import java.util.*;

public class PhoneBook {
    Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber){
        if (phoneBook.containsKey(surname)){
            phoneBook.get(surname).add(phoneNumber);
        } else {
            List<String> numbers = new LinkedList<>();
            numbers.add(phoneNumber);
            phoneBook.put(surname, numbers);
        }
    }

    public String get(String surname) {
        if (phoneBook.containsKey(surname)) {
            return surname + ": " + phoneBook.get(surname);
        }else {
            return "Совпадений не найдено";
        }
    }

}
