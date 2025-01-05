package text.silver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 772ms
public class BOJ_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbzos\\OneDrive\\바탕 화면\\CodingTest\\src\\input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
        System.out.println(pq);
        for (int i = 0; i < N - 1; i++) {
            System.out.println(pq.poll());
        }
        System.out.println(pq.poll());
    }
}

/*
// 744ms
public class BOJ_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbzos\\OneDrive\\바탕 화면\\CodingTest\\src\\input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (pq.size() < N) {
                    pq.offer(num);
                } else if (pq.peek() < num) {
                    pq.poll();
                    pq.offer(num);
                }
                System.out.println(pq);
            }
        }

        System.out.println(pq.peek());
    }
}
*/

/*
// 2876ms
public class BOJ_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dbzos\\OneDrive\\바탕 화면\\CodingTest\\src\\input.txt"));
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N * N];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());

//        System.out.println(Arrays.toString(arr));
        System.out.println(arr[N - 1]);
    }
}

*/
