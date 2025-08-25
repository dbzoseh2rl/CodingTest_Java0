package text.bronze;

import java.util.Scanner;

public class BOJ_24075 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a <= c && c < b) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        sc.close();
    }
}
