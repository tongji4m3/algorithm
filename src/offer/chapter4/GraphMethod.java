package offer.chapter4;

public class GraphMethod {
    public static int degree(Graph G, int v) {
        int degree = 0;
        for (Integer w : G.adj(v)) {
            degree++;
        }
        return degree;
    }

    public static int maxDegree(Graph G) {
        int max = 0;
        for (int v = 0; v < G.V(); v++) {
            if (degree(G, v) > max) {
                max = degree(G, v);
            }
        }
        return max;
    }

    public static double avgDegree(Graph G) {
        return 2.0 * G.E() / G.V();
    }

    public static int numberOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++) {
            for (Integer w : G.adj(v)) {
                if (v==w) count++;
            }
        }
        return count / 2;
    }
}
