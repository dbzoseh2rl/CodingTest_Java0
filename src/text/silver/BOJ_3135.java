package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// solution 1
public class BOJ_3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int min = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(B - k) + 1, min);
        }
        System.out.println(min);
    }
}

/*
// solution 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int A = Integer.parseInt(firstLine[0]);
        int B = Integer.parseInt(firstLine[1]);
        int N = Integer.parseInt(br.readLine());

        int min = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(B - k) + 1, min);
        }

        System.out.println(min);
    }
}
*/
