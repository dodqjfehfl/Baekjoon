import java.io.*;
import java.util.*;

public class Baekjoon_1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = null;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<Node>[] adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<Node>();
        }

        int[] cost = new int[N + 1];
        Arrays.fill(cost, 100001);

        for (int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            adj[a].add(new Node(b, c));
        }

        token = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        // 다익스트라
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(a, 0));
        cost[a] = 0;

        while (!pq.isEmpty()) {
            Node front = pq.poll();

            if (cost[front.city] < front.cost)
                continue;

            for (int i = 0; i < adj[front.city].size(); i++) {
                Node n = adj[front.city].get(i);

                if (cost[n.city] > cost[front.city] + adj[front.city].get(i).cost) {
                    cost[n.city] = cost[front.city] + adj[front.city].get(i).cost;
                    pq.add(new Node(n.city, cost[n.city]));
                }
            }
        }

        System.out.println(cost[b]);
    }

    static class Node implements Comparable<Node> {
        int city, cost;

        public Node(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public int compareTo(Baekjoon_1916.Node o) {
            return this.cost - o.cost;
        }

    }
}
