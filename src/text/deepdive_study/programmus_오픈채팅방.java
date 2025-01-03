package text.deepdive_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class programmus_오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));

    }

    public static String[] solution(String[] record) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();

//        for(String e : record){
//            String[] str = e.split(" ");
//            System.out.println(Arrays.toString(str));
//        }
        HashMap<String, String> hm = new HashMap<>();

        for(int i = 0; i<record.length; i++){
            String[] strArr = record[i].split(" ");

            if(strArr[0].equals("Enter")){
                hm.put(strArr[1],strArr[2]);
            }
            else if(strArr[0].equals("Change")){
                hm.put(strArr[1],strArr[2]);
            }
        }

        for(int i =0; i<record.length; i++){
            String[] strArr = record[i].split(" ");

            if(strArr[0].equals("Enter")){
                answerList.add(hm.get(strArr[1])+"님이 들어왔습니다.");
            }
            else if(strArr[0].equals("Leave")){
                answerList.add(hm.get(strArr[1])+"님이 나갔습니다.");
            }
        }

        answer = answerList.stream().toArray(String[]::new);
        return answer;
    }
}
