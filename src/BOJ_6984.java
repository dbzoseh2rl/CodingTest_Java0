//import java.io.*;
//import java.util.StringTokenizer;
//
//// 2. a만큼 문자열을 2개받은 다음에 그걸 리스트에 넣어야댐
//// 3. 리스트에 넣어준다.
//// 4. b의 테스트 케이스 갯수만큼 bfs를 돌린다.
//// 5. 돌린 최단경로의 앞글자만 따서 출력해준다.
//
//public class BOJ_6984 {
//    static String[][] map = new String[][];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        int a = Integer.parseInt(st.nextToken());
//        // 잘린 st를 정수 a로 받는다.
//        int b = Integer.parseInt(st.nextToken());
//        // 잘린 st를 정수 b로 받는다.
//
//        for (int i = 0; i < a; i++) {
//            String str = br.readLine();
//            st = new StringTokenizer(str, " ");
//            System.out.println(st.nextToken() + " " + st.nextToken());
//        }
//        String[][] map = new String[a][b];
//
//    }
//}
