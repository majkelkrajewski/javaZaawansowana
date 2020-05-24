package com.sda.post.office;

import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Statuses:");
        PackageStatus[] statuses = PackageStatus.values();
        for(PackageStatus status : statuses) {
            System.out.println(status);
        }

        System.out.println("Choose status: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        try {
        PackageStatus chosenStatus = PackageStatus.valueOf(inputText.toUpperCase());
            System.out.println("Status: " + chosenStatus.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
