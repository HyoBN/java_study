import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String [] input = br.readLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        System.out.println(s * 2 - r1);
    }
}
