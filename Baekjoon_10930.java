import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Baekjoon_10930 {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S=br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(S.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : md.digest()) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
    }
}
