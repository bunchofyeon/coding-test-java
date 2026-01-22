import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(0);
            return;
        }

        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;

        while (true) {
            int max = 0;
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[max]) max = i;
            }

            if (dasom > a[max]) break;

            a[max]--;
            dasom++;
            cnt++;
        }

        System.out.println(cnt);
    }
}