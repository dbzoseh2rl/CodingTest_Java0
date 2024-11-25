package text.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> accounts = new HashMap<>();
        System.out.println("*** 명품 은행에 오신 것을 환영합니다. ***");

        while (true) {
            System.out.print("입금:1, 출금:2, 조회:3, 전체 조회:4, 종료:5>> ");
            int option = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (option) {
                case 1: // 입금
                    System.out.print("계좌명과 액수>> ");
                    String[] depositInput = scanner.nextLine().split(" ");
                    if (depositInput.length != 2) {
                        System.out.println("잘못된 입력입니다. '계좌명 액수' 형식으로 입력해주세요.");
                        break;
                    }
                    String depositName = depositInput[0];
                    int depositAmount = Integer.parseInt(depositInput[1]);
                    accounts.put(depositName, accounts.getOrDefault(depositName, 0) + depositAmount);
                    break;

                case 2: // 출금
                    System.out.print("계좌명과 액수>> ");
                    String[] withdrawInput = scanner.nextLine().split(" ");
                    if (withdrawInput.length != 2) {
                        System.out.println("잘못된 입력입니다. '계좌명 액수' 형식으로 입력해주세요.");
                        break;
                    }
                    String withdrawName = withdrawInput[0];
                    int withdrawAmount = Integer.parseInt(withdrawInput[1]);
                    if (accounts.getOrDefault(withdrawName, 0) < withdrawAmount) {
                        System.out.println("잔액이 부족하여 출금할 수 없습니다!!");
                    } else {
                        accounts.put(withdrawName, accounts.get(withdrawName) - withdrawAmount);
                    }
                    break;

                case 3: // 조회
                    System.out.print("계좌명>> ");
                    String queryName = scanner.nextLine();
                    if (accounts.containsKey(queryName)) {
                        System.out.printf("(%s:%d원)\n", queryName, accounts.get(queryName));
                    } else {
                        System.out.println("해당 계좌가 존재하지 않습니다.");
                    }
                    break;

                case 4: // 전체 조회
                    for (Map.Entry<String, Integer> entry : accounts.entrySet()) {
                        System.out.printf("(%s:%d원) ", entry.getKey(), entry.getValue());
                    }
                    System.out.println();
                    break;

                case 5: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
