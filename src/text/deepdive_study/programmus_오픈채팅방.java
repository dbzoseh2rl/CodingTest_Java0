package text.deepdive_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmus_오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));

    }

    public static String[] solution(String[] record) {
        String[] answer = {};

        for(String e : record){
            String[] str = e.split(" ");
            System.out.println(Arrays.toString(str));
        }




        return answer;
    }
}
