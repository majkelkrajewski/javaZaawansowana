package com.sda.exceptions;

public class InvalidNameException extends Exception{
    public InvalidNameException(String name) {
        super("Name [" + name + "] is invalid!");
    }
}
