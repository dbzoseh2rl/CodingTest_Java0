package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class swea_11856 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            char[] str = br.readLine().toCharArray();
            int[] count = new int[26];

            for (char e : str) {
                count[e - 'A']++;
            }

            int cnt = 0;
            for (int freq : count) {
                if (freq == 2) {
                    cnt++;
                }
            }
            sb.append("#").append(tc).append(" ").append(cnt == 2 ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);
        /*for (int tc = 1; tc <= T; tc++) {
            char[] str = br.readLine().toCharArray();
            Set<Character> set = new HashSet<>();
            for(Character a : str) {
                set.add(a);
            }
            String result = "No";
            if(set.size()==2){
                result ="Yes";
            }
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
*/
        /*for (int tc = 1; tc <= T; tc++) {
            String S = br.readLine();
            int[] count = new int[26];

            for (char c : S.toCharArray()) {
                count[c - 'A']++;
            }

            int cnt = 0;
            for (int e : count) {
                if (e == 2) {
                    cnt++;
                }
            }
            sb.append("#").append(tc).append(" ").append(cnt == 2 ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);*/
    }
}
