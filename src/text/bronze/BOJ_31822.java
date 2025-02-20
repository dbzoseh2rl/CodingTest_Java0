package text.bronze;

import java.io.*;

public class BOJ_31822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().substring(0, 5); // 재수강을 해야할 앞 5자리 숫자.

        int count = 0;
        int t = Integer.parseInt(br.readLine()); // 수강신청이 가능한 과목.

        String s;
        while (t-- > 0) {
            s = br.readLine().substring(0, 5); // 수강신청이 가능한 과목의 앞 5자리 숫자.

            if (str.equals(s)) { // 일치한다면 count++
                count++;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
