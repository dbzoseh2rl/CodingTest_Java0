package text.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> mileageMap = new HashMap<>();

        System.out.println("*** 마일리지 관리 프로그램입니다. ***");

        while (true) {
            System.out.print("이름과 마일리지>> ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("올바른 형식으로 입력해주세요. (예: 이름 1000)");
                continue;
            }

            String name = parts[0];
            int mileage;
            try {
                mileage = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("마일리지는 숫자로 입력해주세요.");
                continue;
            }

            mileageMap.put(name, mileageMap.getOrDefault(name, 0) + mileage);
        }

        System.out.println("\n*** 마일리지 현황 ***");
        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {
            System.out.printf("(%s: %d) ", entry.getKey(), entry.getValue());
        }
        System.out.println();

        String topCustomer = null;
        int maxMileage = 0;

        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {
            if (entry.getValue() > maxMileage) {
                maxMileage = entry.getValue();
                topCustomer = entry.getKey();
            }
        }

        System.out.printf("가장 마일리지가 높은 고객은 %s입니다.\n", topCustomer);
        System.out.println("프로그램을 종료합니다.");

        scanner.close();
    }
}

