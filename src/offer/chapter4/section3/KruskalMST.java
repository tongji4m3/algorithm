package offer.chapter4.section3;

import offer.chapter1.UF;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KruskalMST {
    //存储最小生成树
    private Queue<Edge> mst;

    public KruskalMST(EdgeWeightedGraph G) {
        mst = new LinkedList<>();

        PriorityQueue<Edge> minPQ = new PriorityQueue<>();
        for (Edge edge : G.edges()) {
            minPQ.offer(edge);
        }

        UF uf = new UF(G.V());
        while (!minPQ.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = minPQ.poll();
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                continue;
            }
            uf.union(v, w);
            mst.offer(e);
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }
}
