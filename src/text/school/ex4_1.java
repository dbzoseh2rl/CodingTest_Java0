package text.school;

import java.util.Scanner;

public class ex4_1 {
    public static void main(String args[]) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }

    static class TV {
        private String company;
        private int year;
        private int size;

        public TV(String company, int year, int size) {
            this.company = company;
            this.year = year;
            this.size = size;
        }

        public void show() {
            System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
        }
    }
}


