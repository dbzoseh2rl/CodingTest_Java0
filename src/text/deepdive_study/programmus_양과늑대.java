package text.deepdive_study;

import java.util.*;

public class programmus_양과늑대 {
    public static void main(String[] args) {
        Integer[] info = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        Integer[][] edges = {{0, 1}, {1, 2}, {1, 4}, {0, 8}, {8, 7}, {9, 10}, {9, 11}, {4, 3}, {6, 5}, {4, 6}, {8, 9}};

        int result = solution(info, edges);
        System.out.println("Maximum sheep: " + result);
    }

    public static int solution(Integer[] info, Integer[][] edges) {
        int n = info.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 그리기
        for (Integer[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        // Initialize visited array and result list
        boolean[] visited = new boolean[n];
        List<Integer> answer = new ArrayList<>();

        // DFS 루트 시작
        visited[0] = true;
        dfs(0, 1, 0, info, graph, visited, answer);

        // Return the maximum number of sheep
        return Collections.max(answer);
    }

    public static void dfs(int node, int sheep, int wolf, Integer[] info, List<List<Integer>> graph, boolean[] visited, List<Integer> answer) {
        if (sheep > wolf) {
            answer.add(sheep);
        } else {
            return;
        }

        for (int child : graph.get(node)) {
            if (!visited[child]) {
                visited[child] = true;
                if (info[child] == 0) {
                    dfs(child, sheep + 1, wolf, info, graph, visited, answer);
                } else {
                    dfs(child, sheep, wolf + 1, info, graph, visited, answer);
                }
                visited[child] = false;
            }
        }
    }
}