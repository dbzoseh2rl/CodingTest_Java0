package text.swea.D3.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class swea_1221 { //1221
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>(){{
            put("ZRO", 0);
            put("ONE", 1);
            put("TWO", 2);
            put("THR", 3);
            put("FOR", 4);
            put("FIV", 5);
            put("SIX", 6);
            put("SVN", 7);
            put("EGT", 8);
            put("NIN", 9);
        }};
        String[] words = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
//        System.out.println(map);
        for (int P = 1; P <= TC; P++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            StringBuilder sb = new StringBuilder();
            sb.append(a).append("\n");
            int b = Integer.parseInt(st.nextToken());

            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < b; i++) {
                String numStr = st.nextToken();
                int num = map.get(numStr); // 숫자 문자열을 숫자로 변환
                arr[num]++; // 해당 숫자의 카운트 증가
            }
//            System.out.println(Arrays.toString(arr));

            // 출력 형식에 맞게 결과 출력

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(words[i]).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}


/*
1
#1 20
SVN FOR ZRO NIN FOR EGT EGT TWO FOR FIV FIV ONE SVN ONE ONE FIV TWO SVN SIX ONE
*/
