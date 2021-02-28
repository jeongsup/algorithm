package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level3_8_11022 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            // "Case #x: A + B = C"
            sb.append("Case #" + i + ": " + fir + " + " + two + " = " + (fir + two) + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
