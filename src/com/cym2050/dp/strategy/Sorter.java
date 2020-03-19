package com.cym2050.dp.strategy;

public class Sorter {

    public static void sort(Cat[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            //System.out.println("minPos:" + minPos);

            swap(arr, i, minPos);

            //System.out.println("经过第" + i + "次循环之后，数组的内容：");
            //print(arr);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
