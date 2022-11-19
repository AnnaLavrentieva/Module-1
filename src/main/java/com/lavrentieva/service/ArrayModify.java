package com.lavrentieva.service;
public class ArrayModify {
    public static int[] sortOne(int[] array, int arrayLength,int sortMethod) {
        for (int j = 0; j < arrayLength - 1; j++) {
            for (int i = 0; i < arrayLength - 1; i++) {
                int firstNumber = array[i];
                int secondNumber = array[i + 1];
                if (sortMethod==1?firstNumber > secondNumber:firstNumber < secondNumber) {
                    int number = firstNumber;
                    firstNumber = secondNumber;
                    secondNumber = number;
                }
                array[i] = firstNumber;
                array[i + 1] = secondNumber;
            }
        }
        return array;
    }

    public static int[] inCube(int[] array, int arrayLength) {
        for (int i = 2; i < arrayLength; i += 3) {
            array[i] = array[i] * array[i] * array[i];
        }
        return array;
    }
}
