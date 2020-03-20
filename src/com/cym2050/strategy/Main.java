package com.cym2050.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        //Cat[] cat = {new Cat(1, 1), new Cat(3,3), new Cat(2, 2)};
        Dog[] dogs = {new Dog(1), new Dog(3), new Dog(2)};
        Sorter sorter = new Sorter();
        sorter.sort(dogs); 
        System.out.println(Arrays.toString(dogs));

    }
}
