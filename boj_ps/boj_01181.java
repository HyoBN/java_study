import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int n=Integer.parseInt(br.readLine());

        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=br.readLine();
        }
        
        Arrays.sort(s,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length()-s2.length();
                }
            }
        });
        
        String tmp="";
        for(int i=0;i<n;i++){
            if(s[i].compareTo(tmp)==0)
                continue;
            tmp=s[i];
            System.out.println(s[i]);
        }
    }
}