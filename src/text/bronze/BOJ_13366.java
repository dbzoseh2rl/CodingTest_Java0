package text.bronze;

import java.io.*;

public class BOJ_13366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int num = 0;
            for (char c : br.readLine().toCharArray()) num += (c - '0');
            bw.append(num % 9 == 0 ? "YES" : "NO").append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int t = Integer.parseInt(br.readLine());
//
//        BigInteger bignumber1 = new BigInteger("9");
//
//        for (int i = 0; i < t; i++) {
//            BigInteger bignumber2 = new BigInteger(br.readLine());
//
//            // 9로 나누었을때 떨어지는지 확인 해야되는디 ?
//            if (bignumber2.remainder(bignumber1).equals(BigInteger.ZERO)) {
//                bw.append("YES\n");
//            } else {
//                bw.append("NO\n");
//            }
//        }
//        bw.flush();
//        bw.close();
}
