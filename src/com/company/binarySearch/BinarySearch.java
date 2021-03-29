package com.company.binarySearch;


public class BinarySearch {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static int search(IPAddress[] addresses, long key) {
        int low = 0;
        int high = addresses.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (addresses[mid].compareTo(key) == -1) {
                high = mid - 1;
            } else if (addresses[mid].compareTo(key) == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
