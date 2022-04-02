import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb=new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int x=0;
        
        for(int i=0;i<n;i++){
            int tmp=Integer.parseInt(br.readLine());
            
            if(tmp>x){
                for(int j=x+1;j<=tmp;j++){
                    st.push(j);
                    sb.append('+').append('\n');
                }
                x=tmp;
            }
            else if(st.peek()!=tmp){
                System.out.println("NO");
                return;
            }
            st.pop();
            sb.append('-').append('\n');  
        }         
        System.out.println(sb);
    }
}