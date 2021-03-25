package com.company.bubbleSort;

public class BubbleSort {

    static boolean swapped;

    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j < elements.length - i; j++) {
                if (elements[j - 1] > elements[j]) {
                    swap(elements, j - 1, j);
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void swap(int[] elements, int a, int b) {
        int tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
        swapped = true;
    }

}
