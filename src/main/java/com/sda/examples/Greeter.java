package com.sda.examples;

public class Greeter {

    public void greet() {
        greet("Hello", " World");
    }

    public void greet (String name) {
        System.out.println("Hello, " + name);
    }

    public void greet(String greeting, String name) {
        System.out.println(greeting + "," + name + "!");
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        greeter.greet();;
        greeter.greet("Karol!");
        greeter.greet("Cześć", " Wiktoria");
    }
}
