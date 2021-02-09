package offer.chapter2;

import java.util.Arrays;

public class Heap {
    public static void sort(Comparable[] a) {
        int N = a.length - 1;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }

        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j + 1 <= N && less(a[j], a[j + 1])) {
                ++j;
            }
            if(less(a[j],a[k])) break;
            exch(a, j, k);
            k = j;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 5, 4, 9, 3, 1, 2, 3, 7};

        Comparable[] temp = new Comparable[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            temp[i + 1] = a[i];
        }
        sort(temp);
        System.out.println(Arrays.toString(temp));

    }
}
