package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class
BOJ_13223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int ahh = Integer.parseInt(st.nextToken());
        int amm = Integer.parseInt(st.nextToken());
        int ass = Integer.parseInt(st.nextToken());
        int amount = ahh * 3600 + amm * 60 + ass;

        st = new StringTokenizer(br.readLine(), ":");
        int bhh = Integer.parseInt(st.nextToken());
        int bmm = Integer.parseInt(st.nextToken());
        int bss = Integer.parseInt(st.nextToken());
        int bamount = bhh * 3600 + bmm * 60 + bss;

        int value = bamount - amount;

        if (value <= 0) value += 24 * 3600;

        int h = value / 3600;
        int m = (value % 3600) / 60;
        int s = value % 60;

        System.out.printf("%02d:%02d:%02d", h, m, s);

    }
}
