package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();

    public static void dfs(int start) {
        check[start] = true;
        sb.append(start + " ");

        for (int i = 1; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i])
                dfs(i);
        }

    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()) {
            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        //sb.append("\n");
        dfs(start);
        sb.append("\n");
        check = new boolean[node + 1];
        bfs(start);
        System.out.println(sb);

    }
}

/* BFS 와 DFS 설명
- DFS (Depth-First Search, 깊이 우선 탐색) 알고리즘에 경우 두 가지 방법으로 풀 수 있다.
1) 스택을 이용하는 것이다.
2) 재귀함수를 이용하는 것인데, 재귀 함수의 코드가 훨씬 짧다.
3) 모든 경우의 수를 탐색하고자 하는 미로 문제가 같은 경우에 적합하다. 이유는 미로 문제는 최단 경로가 아닌 탈출하는 경로를 고려해야 하기 때문이다.

- BFS (Breadth-First-Search, 너비 우선 탐색) 알고리즘은 Queue를 사용해서 무제를 해결하면 된다.
1) 두 지점 사이의 최단 경로를 찾는 문제에 적합하다.
2) FIFO (First In First Out) 원칙이다.
 */

/*
1. 인스턴스에 공통적으로 사용해야하는 것에 static을 붙인다.

인스턴스를 생성하면, 각 인스턴스들은 서로 다른 독립적인 메모리를 할당받기 때문에 서로 다른 값을 유지한다.
경우에 따라 인스턴스들이 공통적인 값이 유지되어야 하는 경우에는 static을 붙인다.
2. static이 붙은 멤버변수는 인스턴스를 생성하지 않아도 사용할 수 있다.

static이 붙은 멤버변수(클래스변수)는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문이다.
3. static이 붙은 메소드(함수)에선 인스턴스 변수를 사용할 수 없다.

static메소드는 인스턴스 생성 없이 호출 가능한 반면,
인스턴스 변수는 인스턴스를 생성해야만 존재하기 때문에
static이 붙은 메소드를 호출할 때 인스턴스가 생성되어
있을 수도 아닐 수도 있기 때문에 static이 붙은 메소드에서
인스턴스 변수의 사용을 허용하지 않는다.
 */

/*
 next() = 숫자 치고 엔터치면 엔터전까지 입력받음.
 nextLine() = 한줄 단위로 입력받음
 IOException = main method에서는 IOException이 발생할 수도 있는 작업을할것이며, 에러가 발생하면, 이를 처리하지않고 main을 부른곳으로 에러를 던짐

 */

