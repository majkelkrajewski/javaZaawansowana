package com.sda.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetTextExceptionApp {
    public static void main(String[] args) {
        try {
            List<String> texts = List.of("Ala", "ma", "kota", "a", "Karol", "komputer");

            System.out.println("choose index from 0 to " + texts.size() + ":");

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            System.out.println("You entered " + text);

            int index = Integer.parseInt(text);

            System.out.println("Chosen text: " + texts.get(index));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("You asked for too much!");
        } catch(NumberFormatException exception) {
            System.out.println("Text you entered is not a number");
        } finally {
            System.out.println("Exiting!");
        }


    }
}
