package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int directDistance = (b >= a) ? (b - a) : (b - a + m);
        int wrapAroundDistance = (m - a + b);

        System.out.println(Math.min(directDistance, wrapAroundDistance));
    }
}
