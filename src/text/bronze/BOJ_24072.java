package text.bronze;

import java.util.Scanner;

public class BOJ_24072 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c < a || b <= c)
            System.out.print(0);
        else
            System.out.print(1);
    }
}
