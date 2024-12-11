package text.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10610 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] arr = new int[N.length()];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = N.charAt(i) - '0';
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if (!N.contains("0") || sum % 3 != 0) {   //0 포함안되거나 arr합을 3으로 나눴을때 나머지가 0이 아닐경우
            System.out.println("-1");
        } else {
            // 내림차순 정렬
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb);
        }
    }
}
