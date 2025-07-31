package text.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17945 {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int A,B;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void process() {
        for(int i = -1000; i <= 1000 ; i++){
            if(Math.pow(i,2) + 2*A*i + B == 0){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }

}
