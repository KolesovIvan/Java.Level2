package ru.geekbrains.lesson2_1;

public class DigitCalculator {
    public int calc(String[][] values) {
        if (values.length != 4) {
            throw new MyArraySizeException("Array must be 4-length size only");
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i].length != 4) {
                throw new MyArraySizeException("Array must be 4-length size only");

            }
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("Array[%s][%s] must contain parsable digits only", i, j);
                    throw new MyDataArrayException(message, e);
                }
                
            }
            
        }

        return sum;
    }
}
