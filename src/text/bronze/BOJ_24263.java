package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //입력 크기 입력받음 => 이것이 수행 홧수
        br.close();
        System.out.println(n);
        System.out.println(1);
    }

}
