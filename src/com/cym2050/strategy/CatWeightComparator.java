package com.cym2050.strategy;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int Compare(Cat o1, Cat o2) {
        if(o1.weight > o2.weight)
            return 1;
        else if(o1.weight < o2.weight)
            return -1;
        else
            return 0;
    }
}
