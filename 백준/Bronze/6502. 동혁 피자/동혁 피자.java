import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = 1;
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break; // 입력 종료

            StringTokenizer st = new StringTokenizer(line);
            int r = Integer.parseInt(st.nextToken()); // 반지름
            int w = Integer.parseInt(st.nextToken()); // 너비
            int l = Integer.parseInt(st.nextToken()); // 높이

            if (r == 0) break;

            int p = w * w + l * l;      // 피자 대각선의 제곱
            int t = (2 * r) * (2 * r);  // 테이블 지름의 제곱

            if (p <= t) {
                System.out.printf("Pizza %d fits on the table.%n", caseNum);
            } else {
                System.out.printf("Pizza %d does not fit on the table.%n", caseNum);
            }

            caseNum++;
        }
    }
}