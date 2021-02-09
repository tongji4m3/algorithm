package offer;

import java.util.Arrays;

public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int cnt = 0;

        for (int i = 0; i < a.length; i++) {
            //避免重复计数
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }

        return cnt;
    }
}
