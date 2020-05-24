package com.sda.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCollectionsApp {
    public static void main(String[] args) {
        List<String> teksty = new ArrayList<>();
        teksty.add("Tekst 1");
        teksty.add("Tekst 2");

        for (int i = 0; i < teksty.size(); ++i) {
            System.out.println(teksty.get(i));
        }

        Map<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Karol", "662625727");
        phoneNumbers.put("Alina", "798506465");

        System.out.println(phoneNumbers.get("Alina"));
        System.out.println(phoneNumbers.get("Marek"));
        System.out.println(phoneNumbers.containsKey("Karol"));
        System.out.println(phoneNumbers.containsValue("0700888888"));
    }
}
