package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* TC
1
3 5/2
*/

public class BOJ_11526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String node = st.nextToken();
//            System.out.println(num);
//            System.out.println(node);

            String[] arr = node.split("/");
            int arr_p = Integer.parseInt(arr[0]);
            int arr_q = Integer.parseInt(arr[1]);
//            System.out.println(Arrays.toString(arr));

            int s = findNodeNumber(1, 1, 1, arr_p, arr_q);
            System.out.println(num + " " + s);
        }
    }

    public static int findNodeNumber(int n, int p, int q, int targetP, int targetQ) {
        while (p != targetP || q != targetQ) {
            if (targetP < targetQ) {
                // Move to the left child
                n = n * 2;
                q = p + q;
            } else {
                // Move to the right child
                n = n * 2 + 1;
                p = p + q;
            }
        }
        return n;
    }
}