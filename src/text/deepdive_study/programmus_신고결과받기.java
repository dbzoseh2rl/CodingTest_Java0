package text.deepdive_study;

import java.util.*;


public class programmus_신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];   // 메일 받은 횟수
        Map<String, Integer> idxMap = new HashMap<>();   //유저 순서
        Map<String, HashSet<String>> map = new HashMap<>(); // 유저별 자신을 신고한 사람 set

        // 배열 초기화
        for (int i = 0; i < id_list.length; i++) {
            idxMap.put(id_list[i], i); // 유저 이름과 해당 인덱스를 저장
            map.put(id_list[i], new HashSet<>()); // 유저별 신고자 리스트 초기화
        }
/*
        System.out.println(map);
        System.out.println(idxMap);
*/

        // 자신을 신고한 유저 이름 짤라서 저장
        for (String e : report) {
            String[] str = e.split(" ");
            map.get(str[1]).add(str[0]);
        }
/*        System.out.println("_______________________________");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("________________________________");
        System.out.println(idxMap);
        System.out.println(map);
        System.out.println("________________________________");*/

        // 신고된 횟수 확인 후 k 이상인 경우 알림 증가
        for (String e : map.keySet()) {
            if (map.get(e).size() >= k) { // 신고된 횟수가 k 이상인 경우
                for (String s : map.get(e)) { // 신고자들에게 알림 추가
                    answer[idxMap.get(s)]++;
                }
            }
        }

//        System.out.println(idxMap);
        return answer;
    }
}
