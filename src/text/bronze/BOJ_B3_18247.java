package text.bronze;

import java.util.Scanner;

public class BOJ_B3_18247 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int L = 12;

        int Tcase = scan.nextInt();

        for(int i = 0; i < Tcase; i++) {
            int N = scan.nextInt();
            //행
            int M = scan.nextInt();
            //열
            if(N < 12 || M < 4) {
                System.out.println(-1);
                break;
                //N이 12보다 작고 M이 4보다 작으면
                //성립할 수 없다.
            }else {
                int answer = (L * M) - (M - 4);
                //L 까지의 전체 자석에서  (M-4) 를 뺴주면 L4의 위치가 된다.
                System.out.println(answer);
            }

        }

    }
}
