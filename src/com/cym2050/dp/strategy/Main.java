package com.cym2050.dp.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] cat = {new Cat(1, 1), new Cat(3,3), new Cat(2, 2)};
        Sorter sorter = new Sorter();
        sorter.sort(cat);
        System.out.println(Arrays.toString(a));

    }
}
