package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level3_10_2439 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // for (int i = 1; i <= T; i++) {
        // for (int j = 0; j <= T - 1; j++) {
        // if (T <= i + j) {
        // sb.append("*");
        // } else {
        // sb.append(" ");
        // }
        // }
        // System.out.println(sb);
        // }

        for (int i = 1; i <= T; i++) {
            sb.append(" ".repeat(T - i)).append("*".repeat(i)).append("\n");
        }
        System.out.println(sb);

        br.close();
    }

}
