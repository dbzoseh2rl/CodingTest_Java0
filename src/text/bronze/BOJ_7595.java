package text.bronze;

import java.io.*;

public class BOJ_7595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        while (tc != 0) {
            for (int i = 1; i <= tc; i++) {
                for (int j = 0; j < i; j++) {
                    bw.append("*");
                }
                bw.newLine();
            }
            bw.flush();
            tc = Integer.parseInt(br.readLine());
        }
        bw.close();
        br.close();
    }
}

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        while(a != 0) {
            for(int i = 1; i <= a; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            a = sc.nextInt();
        }
        sc.close();
    }
}*/
