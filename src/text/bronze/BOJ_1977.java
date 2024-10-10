package text.bronze;//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class BOJ_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 1; i*i <= b; i++) {
            if (i * i >= a && i * i <= b) {
                min = Math.min(i * i, min);
                sum += i * i;
            }
        }
        if (sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
