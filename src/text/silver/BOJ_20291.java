package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            String[] num = a.split("\\.");
            String ret1 = num[1];
            map.put(ret1, map.getOrDefault(ret1, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        /*int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            String[] num = a.split("\\.");
//            String ret1 = num[0];
//            String ret2 = num[1];
            String ret1 = num[1];
            map.put(ret1, map.getOrDefault(ret1, 0) + 1);
//            arrayList.add(ret2);
        }
//        System.out.println(map);
//        TreeMap<String, Integer> sorted_map = new TreeMap<>(map);
//        System.out.println(sorted_map);
        // 향상된 for 문
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        // 향상된 for 문
        //for (String e : sorted_map.keySet()) {
            //System.out.println(e + " " + sorted_map.get(e));
        //}
//        System.out.println(arrayList);
*/
    }
}
