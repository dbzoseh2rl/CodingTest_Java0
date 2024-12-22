package text.deepdive_study;


public class programmus_주식가격 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                cnt++;
                if (prices[j] < prices[i]) {
                    break;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        programmus_주식가격 sp = new programmus_주식가격();
        int[] prices = {1, 2, 3, 2, 3};
        int[] result = sp.solution(prices);

        // 결과 출력
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
