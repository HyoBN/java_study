import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = null;
        
        int n=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());

        int idx=0;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            arr1[i]=arr2[i]=Integer.parseInt(st.nextToken());            
        }
        Arrays.sort(arr2);
        
        
        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i],idx++);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int x : arr1){
            sb.append(map.get(x)).append(" ");
        }
        System.out.println(sb);
    }
}