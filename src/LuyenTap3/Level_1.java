package LuyenTap3;

import java.util.Scanner;

public class Level_1 {
    public static void main(String[] args) {
        System.out.println("Tìm số lẻ");
        System.out.println("Nhập số thứ nhất");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        System.out.println("Nhập số thứ high");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();
        System.out.println("Từ " + number1 + " tới " + number2 + " có số lẻ là: ");
        for (int i = number1; i < number2 ; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
