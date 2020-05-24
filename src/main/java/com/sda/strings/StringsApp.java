package com.sda.strings;

public class StringsApp {
    public static void main(String[] args) {
        String text = "Ala ma kota ";
        System.out.println(text);

        StringOperation operation = new TextUpperCase();
        System.out.println(operation.modify(text));

        operation = new TextDuplicate();
        System.out.println(operation.modify(text));

        StringOperation appendTextOperation = new AppendText();
        System.out.println(appendTextOperation.modify("Karol"));

        StringOperation appendTextOperationAnonClass = new StringOperation() {
            @Override
            public String modify(String text) {
                return "MODIFIED BY ANONYMUS CLASS: " + text;
            }
        };
        System.out.println(appendTextOperationAnonClass.modify("Karol"));

    }

    public static void modifyAndPrint(String text, StringOperation operation) {
        System.out.println(operation.modify(text));
    }
}
