package com.sda.strings;

public class StringsApp {
    public static void main(String[] args) {
        String text = "Ala ma kota ";
        System.out.println(text);

        StringOperation operation = new TextUpperCase();
        System.out.println(operation.modify(text));

        operation = new TextDuplicate();
        System.out.println(operation.modify(text));

    }

    public static void modifyAndPrint(String text, StringOperation operation) {
        System.out.println(operation.modify(text));
    }
}
