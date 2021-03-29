package com.company.binarySearch;

import com.company.bubbleSort.IPAddress;

public class BinarySearch {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static int search(IPAddress[] elements, long key) {
        int low = 0;
        int high = elements.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (elements[mid].compareTo(elements) == -1) {
                high = mid - 1;
            } else if (elements[mid].compareTo(key) == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
