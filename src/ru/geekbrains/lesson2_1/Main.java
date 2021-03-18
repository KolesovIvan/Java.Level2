package ru.geekbrains.lesson2_1;

public class Main {

    public static void main(String[] args) {
        String[][] values = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "FF"}
        };
        new DigitCalculator().calc(values);


    }
}
