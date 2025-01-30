package text.bronze;

import java.util.Scanner;

public class BOJ_25238 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//몬스터 방어율 수치
        int b=sc.nextInt();//방무

        double result=a- (double) (a * b) /100;
        if(result>=100){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
