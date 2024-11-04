package text.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/* tc = 6 8 22 78 99 100 54 44 250 2346 */
public class ex3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수 10개를 입력하세요 >> ");
        int n[] = new int[10];

        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
            if (n[i] % 3 == 0)
                System.out.println(n[i]);
        }
    }
        /*public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("양의 정수 10개를 입력>> ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.print("3의 배수는...");
            int[] n = new int[10];
            for (int i = 0; i < 10; i++) {
                n[i] = Integer.parseInt(st.nextToken());
                if (n[i] % 3 == 0) {
                    System.out.print( n[i] + " ");
                }
            }
        }*/


}
