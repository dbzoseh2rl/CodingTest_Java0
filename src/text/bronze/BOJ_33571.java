package text.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_33571 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> holes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            holes.add(sc.nextInt());
        }
        Collections.sort(holes);

        double totalArea = 0;
        for (int i = 0; i < n; i++) {
            totalArea += (double) holes.get(i) * holes.get(i);
        }

        System.out.println(totalArea);
    }
}
