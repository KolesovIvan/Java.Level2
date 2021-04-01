package ru.geekbrains.lesson2_5;

import java.util.Arrays;

public class ArrayCalculator {
    private static final int size = 10000000;
    private static final int half = size / 2;
    private float[] arr = new float[size];

    public void calc() {
        long start = System.currentTimeMillis();

        Arrays.fill(arr, 1);

        float[] arr1 = new float[half];
        float[] arr2 = new float[half];

        System.arraycopy(arr, 0, arr1, 0, half);
        System.arraycopy(arr, half, arr2, 0, half);

        Thread t1 = new Thread(() -> {
            fill(arr1);
        });

        Thread t2 = new Thread(() -> {
            fill(arr2);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, half);
        System.arraycopy(arr2, 0, arr, half, half);

        long end = System.currentTimeMillis() - start;

        System.out.println("Took time: " + end);
    }

    private void fill(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}

