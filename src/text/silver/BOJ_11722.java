package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] map = new int[N];
        int[] D = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            D[i] = 1;
        }
        System.out.println(Arrays.toString(map));
        System.out.println(Arrays.toString(D));


    }
}
/*
tc

10
20 50 40 60 50 80 70 50 50 10

6
10 30 10 20 20 10
*/
