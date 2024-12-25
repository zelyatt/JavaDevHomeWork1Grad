package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Vlad", "Kowalski");
        Gson gson = new Gson();
        System.out.println(gson.toJson(person));
    }
}