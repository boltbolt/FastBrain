package com.example;

import java.util.ArrayList;
import java.util.Random;

public class MyClass {


    public static void main(String... args)
    {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("+");
        arrayList.add("-");
        arrayList.add("*");
        arrayList.add("/");

//        final long min = 10; // Минимальное число для диапазона
//        final long max = 75; // Максимальное число для диапазона

//        for (int i = 0; i < 10; i++) {
//            final long rnd = rnd(min, max);
//            System.out.println("Псевдослучайное целое число: " + rnd);
//        }

        int min = 10;
        int max = 20;
        System.out.println(new Random(System.currentTimeMillis()).nextInt(max - min) + min);

    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static long rnd(long min, long max)
    {
        max -= min;
        final double random = Math.random();
        return Math.round((random * max) + min);
    }

}
