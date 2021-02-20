package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level2_4_14681 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (0 < x) {
            System.out.println(0 < y ? "1" : "4");
        } else {
            System.out.println(0 < y ? "2" : "3");
        }
        br.close();
    }
}
