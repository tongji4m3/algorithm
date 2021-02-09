package offer.chapter4.section2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstOrder {
    private boolean[] marked;
    private Queue<Integer> pre;
    private Queue<Integer> post;
    private Stack<Integer> reversePost; //逆后序

    public DepthFirstOrder(Digraph G) {
        pre = new LinkedList<>();
        post = new LinkedList<>();
        reversePost = new Stack<>();
        marked = new boolean[G.V()];

        for (int v = 0; v < G.V(); v++) {
            if(!marked[v]) dfs(G, v);
        }
    }

    private void dfs(Digraph G, int v) {
        pre.offer(v);

        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }

        post.offer(v);
        reversePost.push(v);
    }

    public Stack<Integer> getReversePost() {
        return reversePost;
    }
}
