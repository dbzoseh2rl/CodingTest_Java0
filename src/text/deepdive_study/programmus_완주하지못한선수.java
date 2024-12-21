package text.deepdive_study;

import java.util.*;

public class programmus_완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant1, completion1));
        System.out.println(solution(participant2, completion2));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
//        System.out.println(map);
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
//        System.out.println(map);
        for (String s : map.keySet()) {
            if (map.get(s) > 0) {
                answer = s;
                break;
            }
        }
        return answer;
    }

    /*
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
    */

}
