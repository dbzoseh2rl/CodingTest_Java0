package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());

            double inch = Double.parseDouble(st.nextToken());
            double cycle = Double.parseDouble(st.nextToken());
            double time = Double.parseDouble(st.nextToken());

            if (cycle == 0) {
                break;
            }

            double distance = (inch * 3.1415927 * cycle) / (5280 * 12);
            double mph = (distance * 60 * 60 / time);

            System.out.printf("Trip #%d: %.2f %.2f\n", n++, distance, mph);
        }
    }
}
