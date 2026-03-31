import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException { // IOException 예외처리 추가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) { // i를 1부터 n까지 반복
        
            // 1. 공백 출력: n-i개
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // 2. 별 출력: i개
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 3. 줄바꿈
            System.out.println();
        }
    }
}
