package com.cym2050.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] cats = {new Cat(1, 1), new Cat(3,3), new Cat(2, 2)};
        //Dog[] dogs = {new Dog(5), new Dog(6), new Dog(2)};
        Sorter sorter = new Sorter();
        //sorter.sort(dogs, new DogComparator());       //狗策略
        //sorter.sort(cats, new CatWeightComparator()); //猫体重策略
        sorter.sort(cats, new CatHeightComparator());   //猫身高策略 
        System.out.println(Arrays.toString(cats));
    }
}
