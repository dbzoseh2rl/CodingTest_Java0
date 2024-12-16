package text.school;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex8_2 {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\phone.txt"); // ex8_1에서 생성된 파일
        FileReader fr = null;

        try {
            fr = new FileReader(file); // FileReader로 파일 읽기 준비
            System.out.println("저장된 전화번호 목록입니다:");

            int character;
            while ((character = fr.read()) != -1) { // 파일에서 문자 하나씩 읽기
                System.out.print((char) character); // 읽은 문자를 출력
            }
        } catch (IOException e) { // 파일 읽기 중 오류 처리
            System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close(); // FileReader 닫기
                }
            } catch (IOException e) {
                System.out.println("파일을 닫는 도중 오류가 발생했습니다.");
                e.printStackTrace();
            }
        }
    }
}
