package text.bronze;

import java.io.*;
import java.util.*;

public class BOJ_10990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int k = 0; k < count; k++) {
            for (int j = 0; j < count - k - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (k * 2) - 1; j++) {
                System.out.print(" ");
            }
            if (k > 0) {
                System.out.print("*");
            }
            System.out.println(" ");


        }
    }
}
