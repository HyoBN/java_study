import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int x=Integer.parseInt(br.readLine());
        int i=1;
        while(x>i){
            x-=i;
            i++;
        }

        if(i%2==1){
            System.out.println((i+1-x)+"/"+x);
        }

        else{
            System.out.println(x+"/"+(i+1-x));
        }
    }
}