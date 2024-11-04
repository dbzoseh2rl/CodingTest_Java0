package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_7193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            String X = st.nextToken();

            int dec = 0;
            //페르소마의 소정리
            for (int j = 0; j < X.length(); j++) {
                dec+= Character.getNumericValue(X.charAt(j));
            }
            System.out.println("#" + (i+1) + " " + dec % (N-1));

//            int translate_X = Integer.parseInt(X, N);
//            int result = translate_X % (N - 1);
//            System.out.println("#"+i+" "+result);

//            BigInteger translate_X = new BigInteger(X, N);
//            BigInteger modValue = BigInteger.valueOf(N - 1);
//            BigInteger result = translate_X.mod(modValue);
//
//            System.out.println("#" + i + " " + result);
        }
    }
}
