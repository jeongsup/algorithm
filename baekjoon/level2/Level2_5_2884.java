package level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Level2_5_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int minus = (hour * 60) + minute - 45;
        if (minus < 0) {
            hour = 23;
            minute = 60 - Math.abs(minus);
        } else {
            hour = minus / 60;
            minute = minus % 60;
        }

        bw.write(Integer.toString(hour) + " ");
        bw.write(Integer.toString(minute));
        bw.flush();
        bw.close();
        br.close();
    }
}
