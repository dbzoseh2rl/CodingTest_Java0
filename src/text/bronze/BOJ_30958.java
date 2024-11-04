package text.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//질문: N을 안썼는데..? && 4번 최댓값 출력 이해안됨 && 1번에서 파이선 리스트 컨프리헨션
public class BOJ_30958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String readAlpha = br.readLine();

        // 1. a~z까지 랑 cnt 배열 만들고 초기화 시켜줌;
        int[] alphabet = new int[] {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        int[] cnt = new int[26];
        /*System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(cnt));*/

        // 3. cnt리스트에서 입력한 알파벳 카운트;
        for (int i = 0; i < readAlpha.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (readAlpha.charAt(i) == alphabet[j]) {
                    cnt[j]++;
                }
            }
        }
        /*System.out.println(Arrays.toString(cnt));*/

        //4. 최댓값 출력
        System.out.println(Arrays.stream(cnt).max().getAsInt());
    }
}
