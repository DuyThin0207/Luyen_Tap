package LuyenTap5;

import java.util.Scanner;

public class Lv_2 {
    public static void main(String[] args) {
        System.out.println("Tính tổng S \n Nhập số nguyên");
        Scanner num = new Scanner(System.in);
        int checkNum = num.nextInt();
        int avg = 0;
        for (int i = 0; i <= checkNum; i++) {
            avg = (2 * checkNum) + ((1 / 2) * checkNum) + 2;
        }System.out.println(avg);
    }
}
