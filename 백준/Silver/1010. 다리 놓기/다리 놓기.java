import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 서쪽
            int M = Integer.parseInt(st.nextToken()); // 동쪽
            
            int r = Math.min(N, M - N);
            long result = 1;

            for (int j = 1; j <= r; j++) {
                result = result * (M - r + j) / j;
            }

            sb.append(result).append('\n');
        }
        System.out.print(sb.toString());
    }
}