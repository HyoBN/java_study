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

        int[] arr= new int[3];
        arr[0]=Integer.parseInt(st.nextToken());
        arr[1]=Integer.parseInt(st.nextToken());
        arr[2]=Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        
        int ans=0;
        
        if(arr[0]==arr[2]){
            ans=10000+arr[0]*1000;
        }
        else if(arr[0]==arr[1] || arr[1]==arr[2]){
            ans=1000+arr[1]*100;
        }
        else{
            ans=arr[2]*100;
        }
        
        System.out.println(ans);
    }
}