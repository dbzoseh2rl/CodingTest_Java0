package text.school;

public class ex3_7 {
    public static void main(String[] args) {
        int[] n = new int[10];
        double sum = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 9) + 11;
        }

        System.out.print("랜덤한 정수들...");
        for (int j : n) {
            System.out.print(j + " ");
            sum += j;
        }
        /*for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
            sum += n[i];
        }*/
        System.out.println();
        System.out.print("평균은 " + sum / n.length);
    }
}

