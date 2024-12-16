package text.school;
import java.io.*;
import java.util.*;

public class ex8_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File src = new File("images/가위.jpg");
        File dest = new File("images/바위.jpg");

        try {
            System.out.println("a.jpg 를 b.jpg로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            long f_size = (src.length()/10);
            byte[] buf = new byte[(int)f_size];
            while(true){
                int n = fileInputStream.read(buf);
                fileOutputStream.write(buf,0,n);

                if(n<buf.length)
                    break;
                System.out.print("*");
            }
            fileOutputStream.close();
            fileInputStream.close();
        }
        catch (IOException e){
            System.out.println("입출력 오류");
        }
        scanner.close();
    }

}
