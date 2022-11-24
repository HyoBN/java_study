import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        StringBuilder s = new StringBuilder(br.readLine());
        StringBuilder t = new StringBuilder(br.readLine());

        while (s.length() < t.length()) {
            char ch = t.charAt(t.length() - 1);
            t.deleteCharAt(t.length() - 1);
            if (ch == 'B') {
                t.reverse();
            }
        }
        System.out.println(s.toString().equals(t.toString()) ? 1 : 0);
    }
}
