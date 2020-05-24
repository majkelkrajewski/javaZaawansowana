package com.sda.diary;

import java.time.LocalDate;

public class DiaryApp {
    public static void main(String[] args) {
        Diary diary = new Diary();

        diary.addEntry("First");
        diary.addEntry("Second");
        diary.addEntry("Third");

        System.out.println(diary.getEntry(LocalDate.now()));
    }
}
