package text.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_31994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        int max = 0;
        int tc = 7;
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (max < num) {
                max = num;
                str = name;
            }

        }
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }
}
