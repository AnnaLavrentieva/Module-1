package com.lavrentieva;

import java.util.Arrays;

public class Lock {
    private static int[] arrayFix;

    public Lock(int[] array) {
        int[] arrayFix = new int[array.length];
        this.arrayFix = array;
    }

    final public int[] getArrayFix() {
        return arrayFix;
    }

    public void print() {
        System.out.println(Arrays.toString(arrayFix));
    }
}
