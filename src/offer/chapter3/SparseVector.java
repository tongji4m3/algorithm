package offer.chapter3;

import java.util.HashMap;

public class SparseVector {
    private HashMap<Integer, Double> hashMap = new HashMap<>();

    public int size() {
        return hashMap.size();
    }

    public void put(int i, double x) {
        hashMap.put(i, x);
    }

    public double get(int i) {
        if(!hashMap.containsKey(i)) return 0.0;
        return hashMap.get(i);
    }

    //所需的时间仅和N加上矩阵中的非零元素成正比
    public double dot(double[] that) {
        double sum = 0.0;
        for (Integer i : hashMap.keySet()) {
            sum += that[i] * get(i);
        }
        return sum;
    }

    /*
    稀疏矩阵
    每个网页中指向其他页面的链接很少，即其中大多数项都是0
     */
    public static void main(String[] args) {

        //N等于互联网所有网页的数量
        int N = 1000;
        double[][] a = new double[N][N];
        double[] x = new double[N];
        double[] b = new double[N];

        /*//原始做法，时间复杂度O(N^2)
        for (int i = 0; i < N; i++) {
            double sum = 0.0;
            for (int j = 0; j < N; j++) {
                sum += a[i][j] * x[j];
            }
            b[i] = sum;
        }*/


        SparseVector[] sparseVectors = new SparseVector[N];
        for (int i = 0; i < N; i++) {
            sparseVectors[i] = new SparseVector();
        }
        for (int i = 0; i < N; i++) {
            b[i] = sparseVectors[i].dot(x);
        }
    }
}
