import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n = Integer.parseInt(br.readLine());
        char ans='F';
        if(n>89){
            ans='A';
        }
        else if(n>79){
            ans='B';
        }
        else if(n>69){
            ans='C';
        }
        else if(n>59){
            ans='D';
        }
        System.out.println(ans);
    }
}