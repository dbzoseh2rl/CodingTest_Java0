package text.bronze;


import java.io.*;

public class BOJ_32288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String in = br.readLine();

        for (int i = 0; i < in.length(); i++) {
            char word = in.charAt(i);
//            System.out.println(word);
            if (word == 'I') {
                sb.append('i');
            } else {
                sb.append('L');
            }
        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
