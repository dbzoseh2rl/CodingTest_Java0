package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class swea_9611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] cnt = new int[10];

            for (int j = 0; j < N; j++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                int c = Integer.parseInt(input[2]);
                int d = Integer.parseInt(input[3]);
                String response = input[4];

                if (response.equals("YES")) {
                    cnt[a]++;
                    cnt[b]++;
                    cnt[c]++;
                    cnt[d]++;
                } else {
                    cnt[a]--;
                    cnt[b]--;
                    cnt[c]--;
                    cnt[d]--;
                }
                System.out.print("#" + i + " ");
                for (int k = 0; k <= 9; k++) {
                    if (cnt[k] >= 0) {
                        System.out.print(k + " ");
                    }
                }
                System.out.println();  // 각 테스트 케이스 결과 출력 후 줄바꿈\
            }
        /*for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine());
            Set<Integer> possibleNumbers = new HashSet<>(); // 가능한 숫자 집합

            for (int i = 0; i <= 9; i++) {
                possibleNumbers.add(i);
            }

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                int c = Integer.parseInt(input[2]);
                int d = Integer.parseInt(input[3]);
                String response = input[4];

                Set<Integer> currentNumbers = new HashSet<>();
                currentNumbers.add(a);
                currentNumbers.add(b);
                currentNumbers.add(c);
                currentNumbers.add(d);

                if (response.equals("YES")) {
                    possibleNumbers.retainAll(currentNumbers);
                } else {
                    possibleNumbers.removeAll(currentNumbers);
                }
            }
            int guessedNumber = possibleNumbers.iterator().next(); // 유일한 숫자 가져오기
            System.out.println("#" + t + " " + guessedNumber);
        }*/
        }
    }
}



/*
Example Input:
1
3
0 5 4 2 YES
4 0 1 9 NO
2 8 7 6 NO

*/
