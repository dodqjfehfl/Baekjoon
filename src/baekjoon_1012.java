import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1012 {

	static class Node {
		int r, c;

		public Node(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { -0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[][] map = new int[N][M];

			for (int k = 0; k < K; k++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1;
			}

			Queue<Node> queue = new LinkedList<>();
			int answer = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1) {
						answer++;
						map[i][j] = 0;
						queue.add(new Node(i, j));

						while (!queue.isEmpty()) {
							Node tmp = queue.poll();

							for (int d = 0; d < 4; d++) {
								int nr = tmp.r + dr[d];
								int nc = tmp.c + dc[d];

								if (nr >= 0 && nc >= 0 && nr < N && nc < M && map[nr][nc] == 1) {
									map[nr][nc] = 0;
									queue.add(new Node(nr, nc));
								}
							}
						}
					}
				}
			}

			System.out.println(answer);

//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < M; j++) {
//					System.out.print(map[i][j] + " ");
//				}
//				System.out.println();
//			}
		}
	}
}
