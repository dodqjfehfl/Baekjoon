import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Baekjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        ArrayList<word> words=new ArrayList<>();

        for(int i=0;i<N;i++){
            word newWord=new word(br.readLine());
            if(!words.contains(newWord))
                words.add(newWord);
        }

        words.sort(word::compareTo);

        for(int i=0;i<words.size();i++){
            System.out.println(words.get(i).str);
        }
    }
    static class word implements Comparable<word>{
        int len;
        String str;

        public word(String str) {
            this.str = str;
            this.len=str.length();
        }

        @Override
        public int compareTo(word o) {
            if(this.len!=o.len)
                return this.len-o.len;
            else{
                for(int i=0;i<this.len;i++){
                    if(this.str.charAt(i)!=o.str.charAt(i))
                        return this.str.charAt(i)-o.str.charAt(i);
                }
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof word)) return false;
            word word = (word) o;
            return Objects.equals(str, word.str);
        }

        @Override
        public int hashCode() {
            return Objects.hash(str);
        }
    }
}

// word class 생성 길이 비교, 같은 길이일때? -> 비교로 리턴
// contains 가 안먹힌다... -> hashcode, equals 만들어