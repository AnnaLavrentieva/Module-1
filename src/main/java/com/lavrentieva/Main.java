package com.lavrentieva;

import com.lavrentieva.service.ArrayModify;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        System.out.println("Write the size of the array. " +
                "The value is an integer, greater than or equal to 10");

        int arrayLength = scanner.nextInt();

        for (int i = 0; i < 1000; i++) {
            if (arrayLength < 10) {
                System.out.println("Please try again, the number is less than or not equal to 10");
                arrayLength = scanner.nextInt();
            } else {
                break;
            }
        }
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        System.out.println("We get the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Choose a sort method:\n " +
                "if you choose from low to high - please, write 1 \n " +
                "if you choose from high to low - please, write 2");

        int sortMethod = scanner.nextInt();
        for (int i = 0; i < 1000; i++) {
            if (sortMethod == 1) {
                break;
            } else if (sortMethod == 2) {
                break;
            } else {
                System.out.println("Please try again, the number has to be equal 1 or 2");
                sortMethod = scanner.nextInt();
            }
        }
        System.out.println();

        if (sortMethod == 1) {
            array = ArrayModify.sortOne(array, arrayLength, sortMethod);
            System.out.println("The array was sorted from low to high: " + Arrays.toString(array));
        }
        System.out.println();

        if (sortMethod == 2) {
            array = ArrayModify.sortOne(array, arrayLength, sortMethod);
            System.out.println("The array was sorted from high to low: " + Arrays.toString(array));
        }
        array = ArrayModify.inCube(array, arrayLength);
        System.out.println("The array was modified: " + Arrays.toString(array));
        System.out.println();

        Lock lock = new Lock(array);
        lock.getArrayFix()[0]=10;
        lock.print();

    }
}

