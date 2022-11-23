import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int t=Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int ans=1;
            HashMap<String, Integer> kind = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0;j<n;j++) {
                String[] input = br.readLine().split(" ");
                if (!kind.containsKey(input[1])) {
                    kind.put(input[1], 1);
                } else {
                    kind.put(input[1], kind.get(input[1]) + 1);
                }
            }
            for (Map.Entry<String, Integer> item : kind.entrySet()) {
                ans*=(item.getValue()+1);
            }
            System.out.println(ans - 1);
        }
    }
}
