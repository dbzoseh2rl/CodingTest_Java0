package text.silver;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1002 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbzos\\OneDrive\\바탕 화면\\CodingTest\\src\\input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            if(x1 == x2 && y1 == y2 && r1 == r2) System.out.println(-1);
            else if(distance > Math.pow((r2 + r1), 2)) System.out.println(0);
            else if(distance < Math.pow((r2 - r1), 2)) System.out.println(0);
            else if(distance == Math.pow((r2 + r1), 2)) System.out.println(1);
            else if(distance == Math.pow((r2 - r1), 2)) System.out.println(1);
            else System.out.println(2);
        }

    }

}
