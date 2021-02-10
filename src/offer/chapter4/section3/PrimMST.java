package offer.chapter4.section3;


/*
最小生成树即含有所有顶点的所有边权重最小的连通子图
是用贪心算法实现的
Prim算法每次将不在树中的顶点且权重最小的边加入树中
选点法，并且每次都是
 */
public class PrimMST {
   /* //距离树最近的边
    private Edge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    //存储有效的横切边
    private IndexMinPQ<Double> pq;

    public PrimMST(EdgeWeightedGraph G) {
        edgeTo = new Edge[G.V()];
        distTo = new double[G.V()];
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        //用0顶点做生成树的起点
        distTo[0] = 0.0;
        pq.insert(0, 0.0);

        //pq每次删除都往最小生成树中加入一个节点，为空时最小生成树就已经构成了
        while (!pq.isEmpty()) {
            visit(G, pq.delMin());
        }
    }

    private void visit(EdgeWeightedGraph G, int v) {
        marked[v] = true;
        //把该顶点相连接的所有不在树中的顶点且距离生成树更小的节点加入
        for (Edge e : G.adj(v)) {
            int w = e.other(v);

            if(marked[w]) continue;

            if (e.weight() < distTo[w]) {
                edgeTo[w] = e;
                distTo[w] = e.weight();

                if(pq.contains(w)) pq.change(w, distTo[w]);
                else pq.insert(w, distTo[w]);
            }
        }
    }*/
}
