import java.util.*;

public class Baekjoon_1753 {

    static class Edge implements Comparable<Edge> {
        int v, weight;

        public Edge(int v, int weight) {
            super();
            this.v = v;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int k = sc.nextInt();

        List<Edge>[] adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < E; i++) {
            adj[sc.nextInt()].add(new Edge(sc.nextInt(), sc.nextInt()));
        }

        // dijkstra
        Edge[] D = new Edge[V + 1];
        boolean[] check = new boolean[V + 1];
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

        // 출발지 설정
        for (int i = 1; i <= V; i++) {
            if (i == k) {
                // 출발지
                D[i] = new Edge(i, 0);
            } else {
                D[i] = new Edge(i, Integer.MAX_VALUE);
            }
            pq.add(D[i]);
        }

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();

            if (edge.weight == Integer.MAX_VALUE)
                break;

            for (Edge next : adj[edge.v]) {
                if (!check[next.v] && D[next.v].weight > D[edge.v].weight + next.weight) {
                    D[next.v].weight = D[edge.v].weight + next.weight;
                    pq.remove(D[next.v]);
                    pq.add(D[next.v]);
                }
            }
            check[edge.v] = true;

        }
        for (int i = 1; i <= V; i++) {
            System.out.println(D[i].weight == Integer.MAX_VALUE ? "INF" : D[i].weight);
        }
    }
}
