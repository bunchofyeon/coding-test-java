import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        while (num < 9999) {
            int num1 = (num + 1) / 100;
            int num2 = (num + 1) % 100;
            long result = (long)(num1 + num2)*(num1 + num2);
            if(result == (num + 1)) {
                bw.write(String.valueOf(num + 1));
                bw.flush();
                return;
            }
            num++;
        }
        bw.write("-1");
        bw.flush();
        return;
        }
    }