import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        HashSet<String> set = new HashSet<String>();
        HashSet<String> ans = new HashSet<String>();

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                ans.add(name);
            }
        }

        System.out.println(ans.size());

        ArrayList<String> forSort = new ArrayList<>(ans);
        Collections.sort(forSort);
        for (int i = 0; i < forSort.size(); i++) {
            System.out.println(forSort.get(i));
        }
    }
}
