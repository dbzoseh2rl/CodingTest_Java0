package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int F = b - a;
        if (F <= 0){
            System.out.print("Congratulations, you are within the speed limit!");
        } else if (F <= 20){
            System.out.print("You are speeding and your fine is $100.");
        } else if (F <= 30){
            System.out.print("You are speeding and your fine is $270.");
        } else if (F >= 31){
            System.out.print("You are speeding and your fine is $500.");
        }
    }
}
