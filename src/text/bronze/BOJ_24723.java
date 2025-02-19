package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        System.out.print((int)Math.pow(2,N));//2의 N제곱의 수를 나타내는 Math 메소드.
    }
}
