package text.school;

public class ex4_2 {
    static class Cube {
        private int length;
        private int width;
        private int height;

        // 생성자
        public Cube(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        // 부피 계산 메서드
        public int getVolume() {
            return length * width * height;
        }

        // 크기 증가 메서드
        public void increase(int l, int w, int h) {
            this.length += l;
            this.width += w;
            this.height += h;
        }

        // 부피가 0인지 확인하는 메서드
        public boolean isZero() {
            return getVolume() == 0;
        }
    }

    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());  // 부피 6 출력
        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());  // 부피 48 출력 (1+1)*(2+2)*(3+3) = 48
        if (cube.isZero()) {
            System.out.println("큐브의 부피는 0");
        } else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
