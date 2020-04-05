package com.algorithms.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BinarySearch {

    public static int binarySearch(List<Integer> arr, int k) {
        Collections.sort(arr);

        int index = Integer.MAX_VALUE;
        int l = -1; int r = arr.size();

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) < k) {
                l = m + 1;
            } else if (arr.get(m) > k) {
                r = m - 1;
            } else if (arr.get(m) == k) {
                index = m;
                break;
            }
        }
        return index;
    }
}
