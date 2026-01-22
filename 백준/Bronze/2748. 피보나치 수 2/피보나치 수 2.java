import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());

    if (n == 0) {
        bw.write("0");
    } else if (n == 1) {
        bw.write("1");
    } else {
        long[] sum = new long[n + 1];
        sum[0] = 0;
        sum[1] = 1;

        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }

        bw.write(String.valueOf(sum[n]));
    }

    bw.flush();
    }
}