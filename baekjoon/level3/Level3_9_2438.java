package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level3_9_2438 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
        br.close();
    }
}
