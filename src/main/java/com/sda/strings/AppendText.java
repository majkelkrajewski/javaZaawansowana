package com.sda.strings;

public class AppendText implements StringOperation {
    @Override
    public String modify(String text) {
        return "MODIFIED " + text;

    }
}
