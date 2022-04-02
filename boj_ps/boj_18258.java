import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st=null;
        StringBuilder sb=new StringBuilder();
        
        Queue<Integer> queue=new LinkedList<Integer>();
        int n=Integer.parseInt(br.readLine());
        int last=0;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String command=st.nextToken();
            
            if(command.compareTo("push")==0){
                int tmp=Integer.parseInt(st.nextToken());
                last=tmp;
                queue.add(tmp); 
            }
            else if(command.compareTo("pop")==0){
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(queue.peek()).append('\n');
                    queue.poll();
                }
            }
            
            else if(command.compareTo("size")==0){
                sb.append(queue.size()).append('\n');
            }
            else if(command.compareTo("empty")==0){
                int x=0;
                if(queue.isEmpty()){
                    x=1;
                }
                sb.append(x).append('\n');
            }
            else if(command.compareTo("front")==0){
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else
                    sb.append(queue.peek()).append('\n');
            }
            else if(command.compareTo("back")==0){
                if(queue.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(last).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}