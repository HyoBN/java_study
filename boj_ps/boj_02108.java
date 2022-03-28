import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        int n=Integer.parseInt(br.readLine());
        double sum=0;
        int[] arr=new int[n+1];
        int[] cnt=new int[8002];
        boolean isSecond=false;
        int max=0,idx=0;
        
        for(int i=0;i<n;i++){
            int tmp=Integer.parseInt(br.readLine());
            arr[i]=tmp;
            sum+=tmp;
            cnt[tmp+4001]++;
        }
        Arrays.sort(arr,0,n);
        
        for(int i=0;i<8002;i++){
            if(cnt[i]>max){
                max=cnt[i];
                idx=i;
                isSecond=false;
            }
            else if(cnt[i]==max && !isSecond){
                idx=i;
                isSecond=true;
            }
        }
        
        System.out.println(Math.round(sum/n));
        System.out.println(arr[n/2]);
        System.out.println(idx-4001);
        System.out.println(arr[n-1]-arr[0]);
    }
}