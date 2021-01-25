import java.io.*;
import java.util.*;

public class Baekjoon_15686 {

    static int N;
    static int M;
//    static Queue<Point> house;
//    static Queue<Point> chicken;
    static ArrayList<Point> house;
    static ArrayList<Point> chicken;
    static boolean[] check;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        N=Integer.parseInt(token.nextToken());
        M=Integer.parseInt(token.nextToken());

        // 맵 -> 맵의 의미가 없는거 같은데 삭제 가능할듯
//        int[][] map=new int[N][N];
        // 집 큐 -> 큐보다는 ArrayList가 나을듯
//        house=new LinkedList<>();
        house=new ArrayList<>();
        // 치킨 큐
//        chicken=new LinkedList<>();
        chicken=new ArrayList<>();

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
//                map[i][j]=Integer.parseInt(token.nextToken());
                int num=Integer.parseInt(token.nextToken());

                if(num==1){
                    house.add(new Point(i,j));
                }else if(num==2){
                    chicken.add(new Point(i,j));
                }
            }
        }

        answer=Integer.MAX_VALUE;
        // 전체 치킨 집에서 M개를 선택
        // 선택한 치킨집들에서 집까지의 거리를 계산
        check=new boolean[chicken.size()];
        combi(0,0);

        System.out.println(answer);
        }

        static void combi(int idx, int sel){
            if(sel==M){
                //계산
                count();
                return;
            }

            if(idx>=chicken.size())
                return;

            check[idx]=true;
            combi(idx+1, sel+1);
            check[idx]=false;
            combi(idx+1, sel);
        }

        static void count(){
            int[] min=new int[house.size()];
            Arrays.fill(min, 987654321);

            for(int i=0;i<chicken.size();i++){
//                Point selected=chicken.poll();
                if(check[i]){
                    // 치킨집이 선택이면 거리 계산
                    for(int j=0;j<house.size();j++){
//                           Point home= house.poll();

//                           min[j]=Math.min(min[j], Math.abs(selected.x- home.x)+Math.abs(selected.y- home.y));
                           min[j]=Math.min(min[j], Math.abs(chicken.get(i).x- house.get(j).x)+Math.abs(chicken.get(i).y- house.get(j).y));

//                           house.add(home);
                    }
                }
//                chicken.add(selected);
            }

            int sum=0;
            for(int num:min){
                sum+=num;
            }
            answer=Integer.min(answer, sum);
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
