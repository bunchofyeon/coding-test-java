import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("#")) break;

            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = Character.toLowerCase(line.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb.toString());
    }
}