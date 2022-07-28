import java.io.*;
import java.util.*;

public class Baekjoon_1107 {

    static int N;
    static int answer;
    static String number;
    static boolean[] button;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        button = new boolean[11]; // T 고장, F 정상

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            button[Integer.parseInt(token.nextToken())] = true;
        }

        int now = 100;
        answer = Math.abs(N - now);
        number = Integer.toString(N);

        // 빈 문자열부터 누르기 시작
        combi("", 0);

        System.out.println(answer);
    }

    private static void combi(String str, int idx) {
        // 각 문자열 - 원하는 번호
        if (str.length() > 0) {
            int temp = Math.abs(Integer.parseInt(str) - N);
            answer = Math.min(answer, temp + idx);
        }

        // 문자열 >= 원하는 번호 문자열 길이+2 return
        if (str.length() >= number.length() + 2)
            return;

        if (idx < number.length()) {
            // 버튼 가능
            if (!button[number.charAt(idx) - '0']) {
                // 누르기
                combi(str + number.charAt(idx), idx + 1);
            } else { // 고장
                // 앞 뒤로 가까운 번호 눌러서 이동
                int temp = number.charAt(idx) - '0';
                for (int i = temp; i <= 9; i++) {
                    if (!button[i]) {
                        combi(str + Integer.toString(i), idx + 1);
                        break;
                    }
                }
                for (int i = temp; i >= 0; i--) {
                    if (!button[i]) {
                        combi(str + Integer.toString(i), idx + 1);
                        break;
                    }
                }
            }
        } else { // 한자리 크게 해서 내려가기
            int temp = 0;
            for (; temp < 10; temp++) {
                if (!button[temp])
                    break;
            }
            combi(str + Integer.toString(temp), idx + 1);
        }
    }
}
