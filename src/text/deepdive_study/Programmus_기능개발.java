package text.deepdive_study;

import java.util.*;

public class Programmus_기능개발 {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(solution(progresses1, speeds1));
        System.out.println(solution(progresses2, speeds2));
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        // 필요 날짜 계산
        for (int i = 0; i < length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]); // 올림 계산
            daysQueue.offer(days);
        }

        while (!daysQueue.isEmpty()) {
            int deployDay = daysQueue.poll(); // 첫 번째 작업의 배포 가능한 날
            int count = 1;

            // 같은 날 배포 가능한 작업 계산
            while (!daysQueue.isEmpty() && daysQueue.peek() <= deployDay) {
                daysQueue.poll();
                count++;
            }

            result.add(count);
        }
        return result;
    }

}
