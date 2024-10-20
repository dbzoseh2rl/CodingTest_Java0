package text.silver;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_7113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (n != m) {
            if (n > m) n -= m;
            else m -= n;
            cnt++;
        }

        bw.append(String.valueOf(cnt + 1)).append("\n");
        bw.flush();
        bw.close();
    }
}

/*while (true) {
            if (n == m) {
                cnt += 1;
                break;
            }
            if (n > m) {
                n = n - m;
                cnt += 1;
            }
            if (n < m) {
                m = m - n;
                cnt += 1;
            }
        }
*/