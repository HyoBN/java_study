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

        
        String str = br.readLine();
        int answer=str.length();
        for(int i=0;i<str.length()-1;i++){
            boolean check=false;
            if(str.charAt(i)=='c'){
                if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-'){
                    check=true;
                }
            }
            else if(str.charAt(i)=='d' && str.charAt(i+1)=='-'){
                check=true;
            }
            
            else if(str.charAt(i)=='d' && i+2<str.length()){
                if(str.charAt(i+1)=='z' && str.charAt(i+2)=='='){
                    answer-=2;
                    i+=2;
                }
            }
            
            else if(str.charAt(i)=='l' && str.charAt(i+1)=='j'){
                check=true;
            }
            else if(str.charAt(i)=='n' && str.charAt(i+1)=='j'){
                check=true;
            }
            else if(str.charAt(i)=='s' && str.charAt(i+1)=='='){
                check=true;
            }
            else if(str.charAt(i)=='z' && str.charAt(i+1)=='='){
                check=true;
            }
            if(check){
                answer--;
                i++;
            }
        }
        
        System.out.println(answer);
    }
}