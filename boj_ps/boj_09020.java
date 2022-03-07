import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        boolean[] notPrime=new boolean[10001];
        notPrime[1]=true;
        for(int i=2;i<Math.sqrt(10001);i++){
            for(int j=i+i;j<10001;j+=i){
                notPrime[j]=true;
            }
        }
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            
            int cnt=0;
            for(int j=n/2;j>=2;j--){
                if(notPrime[j]==false && notPrime[n-j]==false){
                    System.out.printf("%d %d\n",j,n-j);
                    break;
                }
            }
        }
    }
}