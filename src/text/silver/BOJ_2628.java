package text.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> width = new ArrayList<Integer>();
        List<Integer> length = new ArrayList<Integer>();

        width.add(Integer.parseInt(st.nextToken()));
        length.add(Integer.parseInt(st.nextToken()));
        /*
        System.out.println(width);
        System.out.println(length);
        */

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            if(a == 0) { // 가로
                int index;
                for(index = 0  ; where - length.get(index)>0 ; index++ ) {
                    where -= length.get(index);
                }
                int temp = length.remove(index);
                length.add(index,temp-where);
                length.add(index,where);
            }
            else { // 세로
                int index;
                for(index = 0  ; where - width.get(index)>0 ; index++ ) {
                    where -= width.get(index);
                }
                int temp = width.remove(index);
                width.add(index,temp-where);
                width.add(index,where);
            }
        }
        int max = 0;
        for(int i : width) {
            for(int j : length)
                max = Math.max(i*j, max);
        }
        System.out.println(max);
    }
}
