import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        boolean[] notPrime=new boolean[250000];
        notPrime[1]=true;
        for(int i=2;i<Math.sqrt(250000);i++){
            for(int j=i+i;j<250000;j+=i){
                notPrime[j]=true;
            }
        }
        
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0) break;
            int cnt=0;
            for(int i=n+1;i<=2*n;i++){
                if(notPrime[i]==false){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}