import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        
        int r=Integer.parseInt(br.readLine());
        double u = r*r*Math.PI;
        double t = 2*r*r;
        System.out.printf("%.6f\n%.6f",u,t);
    }
}