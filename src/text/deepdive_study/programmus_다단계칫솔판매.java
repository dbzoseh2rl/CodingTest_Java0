package text.deepdive_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class programmus_다단계칫솔판매 {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};


        programmus_다단계칫솔판매 instance = new programmus_다단계칫솔판매();
        int[] result = instance.solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(result));

        /*
        Example input:
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"sam", "emily", "jaimie", "edward"};
        int[] amount = {2, 3, 5, 4};
        */
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        Map<String, String> root = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            if (referral[i].equals("-")) {
                root.put(enroll[i], "center");
            } else {
                root.put(enroll[i], referral[i]);
            }
            total.put(enroll[i], 0);
        }

        for (int i = 0; i < seller.length; i++) {
            String kid = seller[i];
            String parent = root.get(seller[i]);
            int money = amount[i] * 100;

            while (true) {
                total.put(kid, total.get(kid) + money - money / 10);
                money /= 10;
                if (money == 0 || parent.equals("center")) {
                    break;
                }
                kid = parent;
                parent = root.get(kid);
            }
        }

        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.get(enroll[i]);
        }

        return answer;
    }
}
