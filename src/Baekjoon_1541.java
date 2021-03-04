import java.io.*;
import java.util.*;

public class Baekjoon_1541 {

    static int answer;
    static ArrayList<Integer> arrayList;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        arrayList = new ArrayList<Integer>();
        int temp = 0;
        boolean negative = false;
        answer = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // 숫자면
                temp = temp * 10 + (str.charAt(i) - '0');
            } else { // -, +
                     // 숫자를 큐에 넣기
                if (negative) {
                    temp *= -1;
                }
                arrayList.add(temp);
                // 변수 초기화
                temp = 0;
                negative = false;
                // - 확인
                if (str.charAt(i) == '-') {
                    negative = true;
                }
            }
        }
        arrayList.add(temp); // 마지막 숫자
        N = arrayList.size();
        visited = new boolean[N];

        // 재귀를 이용 현재의 숫자를 넣거나 계산
        recur(0, 0);

        System.out.println(answer);
    }

    private static void recur(int sum, int idx) {
        if (idx == N) {
            answer = Integer.min(answer, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) { // 아직 계산하지 않았으면
                visited[i] = true;
                recur(sum + arrayList.get(i), idx + 1);
                visited[i] = false;
            }
        }
    }
}
