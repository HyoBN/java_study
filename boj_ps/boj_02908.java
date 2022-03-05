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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int which=0;
        
        for(int i=1;i<1000;i*=10){
            if(x/i%10 == y/i%10){
                continue;
            }
            else{
                which = x/i%10 > y/i%10 ? x : y;
                break;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(which%10);
            which/=10;
        }
    }
}