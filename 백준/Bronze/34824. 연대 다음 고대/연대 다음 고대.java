import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            String str = br.readLine();
            if(str.equals("yonsei")){
               System.out.println("Yonsei Won!");
               return;
            } else if (str.equals("korea")) {
               System.out.println("Yonsei Lost...");
               return;
            }
        }
    }
}