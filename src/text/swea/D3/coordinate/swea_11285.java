package text.swea.D3.coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_11285 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        int[] arr = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        for(int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                double len = Math.sqrt(x*x + y*y);
                for(int j = 1; j < arr.length; j++) {
                    if(len <= arr[j]) {
                        sum += 11 - j;
                        break;
                    }
                }
            }
            sb.append("#"+tc).append(' ').append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
/*
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int TC = Integer.parseInt(br.readLine());
    for (int t = 1; t <= TC; t++) {
        sb.append("#").append(t).append(" ");
        int ret = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int a = (int) Math.sqrt(X * X + Y * Y);
            ret += sol(X, Y);

        }
    }
}
static int sol(int x, int y) {
    int ret = 0;

    for(int p=10;p>=0;p--) {
        int r = 20*(11-p);

        if(r*r >= x*x+y*y) {
            ret+= p;
            break;
        }
    }
    return ret;
}*/
