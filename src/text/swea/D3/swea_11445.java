package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_11445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String P = br.readLine();
            String Q = br.readLine();
            sb.append("#").append(tc).append(" ");

            // P에 'a'를 추가하여 Q와 비교
            if ((P + "a").equals(Q)) {
                sb.append("N");
            } else {
                sb.append("Y");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}


/*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
        String P = br.readLine();
        String Q = br.readLine();
        sb.append("#").append(tc).append(" ");

        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < P.length(); i++) {
            set.add(P.charAt(i));
        }
        for (int i = 0; i < Q.length(); i++) {
            set.add(Q.charAt(i));
        }
        String result = checkStringLengths(P, Q, set);
        sb.append(result).append("\n");
    }
        System.out.println(sb);
}

public static String checkStringLengths(String P, String Q, Set<Character> set) {
    if (set.size() > P.length() && set.size() > Q.length()) {
        return "Y";
    } else {
        return "N";
    }
}*/
