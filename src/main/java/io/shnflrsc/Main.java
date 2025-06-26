package io.shnflrsc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {6, 7, 9, 1, 2, 3, 4, 5, 8};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    public static int[] bubbleSort(int[] n) {
        while (true) {
            int o = 0;
            for (int i = 0; i < n.length - 1; i++) {
                int x = n[i];
                int y = n[i+1];
                if (x>y) {
                    n[i] = y;
                    n[i+1] = x;
                    o++;
                }
            }
            if (o == 0) {
                break;
            }
        }
        return n;
    }
}