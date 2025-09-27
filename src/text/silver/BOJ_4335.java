package text.silver;

import java.io.*;
import java.util.ArrayList;

public class BOJ_4335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int low = 1;
        int high = 10;
        int a;

        while (true) {
            a = Integer.parseInt(br.readLine());
            if (a == 0) break;

            String b = br.readLine();

            if (b.equals("too high")) {
                high = Math.min(high, a - 1);
            } else if (b.equals("too low")) {
                low = Math.max(low, a + 1);
            } else if (b.equals("right on")) {
                // 정답 판정
                if (a >= low && a <= high) {
                    System.out.println("Stan may be honest");
                } else {
                    System.out.println("Stan is dishonest");
                }

                low = 1;
                high = 10;
            }
        }
    }

}



//
//
//public static void main(String[] args) throws IOException{
//    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//    ArrayList<Integer> low=new ArrayList<>();
//    ArrayList<Integer> high=new ArrayList<>();
//    while(true){
//        int n=Integer.parseInt(br.readLine());
//        if(n==0){
//            break;
//        }
//        String w=br.readLine();
//        if(w.equals("too high")){
//            high.add(n);
//        }
//        else if(w.equals("too low")){
//            low.add(n);
//        }
//        else{
//            boolean a=true;
//            for(int i=0; i<low.size(); i++){
//                a= n <= low.get(i) ? false : a;
//            }
//            for(int i=0; i<high.size(); i++){
//                a= n >= high.get(i) ? false : a;
//            }
//            bw.write(a ? "Stan may be honest\n" : "Stan is dishonest\n");
//            low.clear();
//            high.clear();
//        }
//    }
//    bw.flush();
//}