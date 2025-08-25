package text.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_24075 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a+b;
        int d = a-b;
        System.out.printf("%d %d", c>d?c:d, c>d?d:c);
    }

    public static void main(String[] args) throws Exception {
        new BOJ_24075().solution();
    }
}
