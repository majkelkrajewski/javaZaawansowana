package com.sda.box;

import java.time.LocalDate;

public class BoxApp {
    public static void main(String[] args) {
        Box<String> namebox = new Box<>("Karol");
        String element = namebox.get();
        System.out.println(element);

        Box<LocalDate> dateBox = new Box<>(LocalDate.now());
        LocalDate date = dateBox.get();
        System.out.println(date);

        Box rawBox = new Box ("Karol");
        Object string = rawBox.get();
        System.out.println(string);
    }
}
