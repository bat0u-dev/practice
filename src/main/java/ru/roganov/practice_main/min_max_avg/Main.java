package ru.roganov.practice_main.min_max_avg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));

        int maxValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        int minValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }

        double avgValue;
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        avgValue = (double) sum / array.length;

        System.out.println(minValue + "\n" + maxValue + "\n" + avgValue);
    }
}
