package offer.chapter1;

import java.util.Arrays;

public class ThreeSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int cnt = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (BinarySearch.rank(-a[i] - a[j], a) > j) {
                    ++cnt;
                }
            }
        }

        return cnt;
    }
}
