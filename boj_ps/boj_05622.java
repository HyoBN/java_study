import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        int answer=0;
        int[] alpha={3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        
        String str = br.readLine();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            answer+=alpha[ch-65];
        }
        
        System.out.println(answer);
    }
}