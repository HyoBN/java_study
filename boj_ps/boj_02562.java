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

        int index=0, value=0;
        int[] arr= new int[9];
        for(int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        value=arr[0];
        for(int i=1;i<9;i++){
            if(arr[i]>value){
                index=i;
                value=arr[i];
            }
        }

        System.out.println(value);
        System.out.println(index+1);

    }
}