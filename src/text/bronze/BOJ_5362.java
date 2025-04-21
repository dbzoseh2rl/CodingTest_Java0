package text.bronze;

import java.util.Scanner;

public class BOJ_5362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                start = i;
            } else if (input.charAt(i) == ')') {
                end = i;
                break;
            }
        }
        String result = "";
        if (start != 0 || end != 0) {
            result = input.substring(0, start) + input.substring(end + 1);
        } else {
            result = input;
        }
        System.out.println(result);
    }
}
