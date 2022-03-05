import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = null;
        
        st=new StringTokenizer(br.readLine());
        int hour=Integer.parseInt(st.nextToken());
        int minute=Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        int gap=Integer.parseInt(st.nextToken());
        
        hour=(hour+(minute+gap)/60)%24;
        minute=(minute+gap)%60;
        System.out.print(hour+" "+minute);
    }
}