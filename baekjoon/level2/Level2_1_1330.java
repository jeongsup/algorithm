package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 수 비교하기
 */
public class Level2_1_1330 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int fir = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());

        System.out.println(fir < two ? "<" : fir > two ? ">" : "==");

        // int p[] = new int[2];
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // for (int i = 0; i < 2; i++) {
        // p[i] = Integer.parseInt(st.nextToken());
        // }
        // if (p[0] < p[1]) {
        // System.out.println("<");
        // } else if (p[0] == p[1]) {
        // System.out.println("==");
        // } else {
        // System.out.println(">");
        // }
    }
}