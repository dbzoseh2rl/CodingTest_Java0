package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_10059 {      //유효 기간
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int K = 1; K <= TC; K++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.substring(0, 2)); //MM
            int b = Integer.parseInt(input.substring(2, 4)); //YY

            String result = "NA";

            if (a >= 1 && a <= 12 && a != 0) {
                result = "MMYY";
            }
            if (b >= 1 && b <= 12 && b != 0) {
                result = "YYMM";
            }
            if (a <= 12 && a >= 1 && b >= 1 && b <= 12 && a != 0 && b != 0) {
                result = "AMBIGUOUS";
            }

            System.out.println("#" + K + " " + result);

        }
    }
}
