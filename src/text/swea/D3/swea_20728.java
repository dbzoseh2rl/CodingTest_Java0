package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_20728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int p = 1; p <= T; p++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            long[] newArray = new long[N];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                newArray[j] = Long.parseLong(String.valueOf(st2.nextToken()));
            }
            Arrays.sort(newArray);
            System.out.println(Arrays.toString(newArray));
            long result = 1000000000, max = 0, min = 0;
            for (int i=0; i<=N-K; i++){
                min = newArray[i];//최솟값
                max = newArray[K-1+i];//최댓값
                result = Math.min(max - min, result);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#" + p + " ");
            sb.append(result);
            System.out.println(sb);
        }
    }
}

/*
3
3 2
1 2 3
3 3
5 20 10
4 3
4 3 2 1
*/