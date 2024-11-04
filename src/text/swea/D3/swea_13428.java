package text.swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;

public class swea_13428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++) {
            String n = br.readLine();
            int max = Integer.parseInt(n);
            int min = Integer.parseInt(n);
            for(int i = 0; i < n.length(); i++){
                for(int j = i + 1; j < n.length(); j++){
                    char[] numChar = n.toCharArray();
                    swap(i,j,numChar);
                    if(numChar[0] == '0') continue;
                    int num = Integer.parseInt(new String(numChar));
                    max = Math.max(num,max);
                    min = Math.min(num,min);
                }
            }
            System.out.println("#" + tc + " " + min + " " + max);
        }
    }
    private static void swap(int i ,int j, char[] arr){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
