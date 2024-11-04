package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        if (a.equals("N") || a.equals("n")) {
            System.out.print("Naver D2");
        }
        else{
            System.out.print("Naver Whale");
        }
    }
}
