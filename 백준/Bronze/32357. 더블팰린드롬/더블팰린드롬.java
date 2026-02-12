import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long P = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String rev = new StringBuilder(s).reverse().toString();
            if (s.equals(rev)) P++;
        }

        System.out.println(P * (P - 1));
    }
}