package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_15758 {   //무한 문자열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();

            if((a+b).equals(b+a)){
                System.out.println("#" + i +" "+"yes");
            }else {
                System.out.println("#" + i +" "+"no");
            }
        }
    }
}
