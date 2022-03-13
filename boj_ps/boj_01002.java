import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        
        
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int r1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());
            double distance=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
            int answer;
            
            if(distance==0 && r1==r2){
                answer=-1;
            }
            else if(distance> Math.pow(r1+r2,2)){
                answer=0;
            }
            else if(distance < Math.pow(r2-r1,2)){
                answer=0;
            }
            else if(distance == Math.pow(r2-r1,2)){
                answer=1;
            }
            else if(distance == Math.pow(r1+r2,2)){
                answer=1;
            }
            else{
                answer=2;
            }
            
        
            System.out.println(answer);
        }
    }
}