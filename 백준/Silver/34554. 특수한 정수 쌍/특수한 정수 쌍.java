import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int B = N + 1;

            // B가 소수인지 판별
            boolean b = true;

            if (B < 2) {
                b = false;
            } else {
                for (int j = 2; j * j <= B; j++) {
                    if (B % j == 0) {
                        b = false;
                        break;
                    }
                }
            }
            
            if (b) {
                sb.append(1).append('\n');
                sb.append(1).append(' ').append(B).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}