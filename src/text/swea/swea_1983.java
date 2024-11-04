package text.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class swea_1983 { // 조교의 성적 메기기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            ArrayList<Double> arr = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());

                double a = Integer.parseInt(st2.nextToken());
                double b = Integer.parseInt(st2.nextToken());
                double c = Integer.parseInt(st2.nextToken());
                double result = (a * 0.35) + (b * 0.45) + (c * 0.20);
                arr.add(Double.valueOf(result + "\n"));

            }
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            double value = arr.get(K - 1);
            arr.sort(Comparator.reverseOrder());

            int find = arr.indexOf(value);
            int x = N / 10;
            int z = find / x;

            String FindResult = grade[z];
            System.out.println("#" + i + " " + FindResult);
        }
    }
}
