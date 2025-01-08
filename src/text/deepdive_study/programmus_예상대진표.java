package text.deepdive_study;

public class programmus_예상대진표 {
    public static int solution(int n, int a, int b) {
        int answer = 0;
        while(true){
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer ++;
            if(a == b) break;
            System.out.println(a);
            System.out.println(b);
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n, a, b));
    }
}
