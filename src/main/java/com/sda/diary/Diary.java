package com.sda.diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private static class Entry {
        String text;
        LocalDate date;
    }
    List<Entry> entries = new ArrayList<>();
    public void addEntry(String text) {
        LocalDate now = LocalDate.now();
        Entry entry = new Entry();
        entry.date = now;
        entry.text = text;
        entries.add(entry);
    }
    public String getEntry(LocalDate date) {
        String foundText = null;
        for (int i = 0; i < entries.size(); ++i) {
            Entry entry = entries.get(i);
            if (entry.date.equals(date)) {
                foundText = entry.text;
                // break;
            }
        }
        return foundText;
    }
    private String getEntryEnhancedFor(LocalDate date) {
        String foundText = null;
        for (Entry entry : entries) {
            if (entry.date.equals(date)) {
                foundText = entry.text;
                break;
            }
        }
        return foundText;
    }
    private String getEntryStream(LocalDate date) {
        return entries.stream()
                .filter(entry -> entry.date.equals(date))
                .map(entry -> entry.text)
                .findAny()
                .orElse(null);
    }
}
