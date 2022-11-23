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

        int [][] a1=new int[101][101];
        int [][] a2=new int[101][101];
        int[][] ans = new int[101][101];

        int n1,m1,n2,m2;
        String [] inputSize = br.readLine().split(" ");
        n1 = Integer.parseInt(inputSize[0]);
        m1 = Integer.parseInt(inputSize[1]);
        for (int i = 0; i < n1; i++) {
            String [] input = br.readLine().split(" ");
            for (int j = 0; j < m1; j++) {
                a1[i][j] = Integer.parseInt(input[j]);
            }
        }
        inputSize = br.readLine().split(" ");
        n2 = Integer.parseInt(inputSize[0]);
        m2 = Integer.parseInt(inputSize[1]);
        for (int i = 0; i < n2; i++) {
            String [] input = br.readLine().split(" ");
            for (int j = 0; j < m2; j++) {
                a2[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k <m1; k++) {
                    ans[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
