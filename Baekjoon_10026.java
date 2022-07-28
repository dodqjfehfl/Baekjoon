import java.io.*;
import java.util.*;

public class Baekjoon_10026 {

    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};
    static int N;
    static char[][] board;
    static boolean[][] visited;
    static int normal=0;
    static int adapted=0;
    static Queue<Point> queue=new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        N=Integer.parseInt(br.readLine());

        visited=new boolean[N][N];
        board=new char[N][N];
        for(int i=0;i<N;i++) {
            char[] str=br.readLine().toCharArray();
            for(int j=0;j<N;j++){
                board[i][j]=str[j];
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    normal++;
                    bfs(i,j);
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]=='G')
                    board[i][j]='R';
            }
        }

        visited=new boolean[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    adapted++;
                    bfs(i,j);
                }
            }
        }

        System.out.println(normal+" "+adapted);
    }

    static void bfs(int x,int y){
        char color=board[x][y];
        queue.add(new Point(x,y));
        visited[x][y]=true;

        while (!queue.isEmpty()){
            Point front=queue.poll();

            for(int d=0;d<4;d++){
                int nr=front.x+dr[d];
                int nc=front.y+dc[d];

                if(nr<0 || nr>=N || nc<0 || nc>=N)
                    continue;

                if(visited[nr][nc])
                    continue;

                if(board[nr][nc]==color) {
                    queue.add(new Point(nr, nc));
                    visited[nr][nc]=true;
                }
            }
        }
    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

// 메모리 초과 100*100*
// 배열이 문제가 아니라 큐에 계속 같은 위치를 넣었음 true 위치가 이상했음