package com.codegym;



public class Main {

    public static void main(String[] args) {
        int[] array = {9, 7, 8, 34, 2, 6};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min :" + min);
    }
}
