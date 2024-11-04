import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Test00 {
        public void main(String[] args) throws Exception {
            String input = "0 4 1 9 3 2 1 8";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(input);
            // 입력 방법 1
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            // 출력 방법 1
            for (Integer i : arr) {
                bw.append(String.valueOf(i)).append("\n");
            }
            bw.flush();

            // 입력 방법 2: 코테로 맨 마지막에 이렇게 할 줄 알아야됨 stream으로 함수형 코딩하기가 최종 목표(실제 개발)
            arr = Arrays.stream(input.split(" "))
                    .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

            // 출력 방법 2: 아래 for 보면 해당 방법 구려서 iter로 바꾸라고 추천해줌
            for (int i = 0, size = arr.size(); i < size; i++) {
                System.out.println(arr.get(i));
            }
        }
}


