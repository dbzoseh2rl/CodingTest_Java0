package text.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_25628 {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int bread=Integer.parseInt(st.nextToken());
        int meat=Integer.parseInt(st.nextToken());
        int answer=0;
        while(bread>=2 && meat>=1){
            bread-=2;
            meat-=1;
            answer++;
        }
        bw.write(answer+"");
        bw.flush();
    }
}
