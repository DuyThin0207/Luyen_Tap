package LuyenTap3;

import java.util.Scanner;

public class Level_3 {
    public static void main(String[] args) {
        System.out.println("Tìm số chính phương \n Nhập số thứ nhất");
        Scanner num1 = new Scanner(System.in);
        int checkNum1 = num1.nextInt();
        System.out.println("Nhập số thứ high");
        Scanner num2 = new Scanner(System.in);
        int checkNum2 = num2.nextInt();

        for (int i = checkNum1; i < checkNum2; i++) {
            int check = i * i;
            System.out.println("Số chính phương là : " + check);
        }
    }
}
