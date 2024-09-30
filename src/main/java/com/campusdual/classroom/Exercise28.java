package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args) {
    try{
        throw new RuntimeException();
    } catch (RuntimeException e) {
        throw new RuntimeException(e);
    }
    }
}
