package com.company;

import java.util.Collections;
import java.util.Comparator;

public class CustomComparatorThree implements Comparator <Integer> {

    public int compare(Integer o1, Integer o2) {
        if (o2>99){
            return o2-o1;
        }
        return 0;
    }
}
