package com.company;

import java.util.Comparator;

public class CustomComparatorTwo implements Comparator <Integer> {

    public int compare(Integer o1, Integer o2) {
        if (o1==4){
            return -1;
        }
        return 0;


    }
}
