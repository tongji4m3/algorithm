package offer.chapter4.section2;

public class Topological {
    private Iterable<Integer> order;

    public Topological(Digraph G) {
        DirectedCycle cycle = new DirectedCycle(G);
        if (!cycle.hasCycle()) {
            DepthFirstOrder depthFirstOrder = new DepthFirstOrder(G);
            order = depthFirstOrder.getReversePost();
        }
    }

    public Iterable<Integer> getOrder() {
        return order;
    }

    public static void main(String[] args) {
        int V = 10;
        Digraph G = new Digraph(V);
        Topological topological = new Topological(G);
        for (Integer v : topological.order) {
            System.out.println(v);
        }
    }
}
