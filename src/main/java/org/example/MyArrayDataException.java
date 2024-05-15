package org.example;

public class MyArrayDataException extends RuntimeException {
    int i;
    int j;

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }
}
