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

        
        int t=Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            for(int j=1;j<=w;j++){
                for(int k=1;k<=h;k++){
                    if(n==1){
                        System.out.print(k);
                        if(j<10){
                            System.out.print(0);
                        }
                        System.out.println(j);
                    }
                    n--;
                }
            }
        }
    }
}