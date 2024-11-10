package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea_5603 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t = 1; t <= TC; t++) {
            int result = 0;

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            int total = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                total += arr[i];
            }
//			System.out.print(Arrays.toString(arr));
            int avg = total / N;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] - avg;
                if(arr[i] > 0) {
                    result+=arr[i];
                }
            }
            System.out.println("#" + t + " "+result);

        }
    }

}
