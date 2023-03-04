package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {

        System.out.println((second ^ first) ^ first);
        System.out.println((first ^ second) ^ second);
    }

}
