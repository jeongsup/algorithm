package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level3_3_8393 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println(total);
        br.close();
    }
}
