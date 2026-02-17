import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int a = A;
            int b = B;

            // 최대공약수
            // 두 수의 최대공약수는 큰 수를 작은 수로 나눈 나머지와 작은 수의 최대공약수와 같다
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            int gcd = a;

            // 최소공배수
            long lcm = (long) A * B / gcd;
            System.out.println(lcm);
        }
    }
}