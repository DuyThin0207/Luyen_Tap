package LuyenTap3;

import java.util.Scanner;

public class Level_2 {
    public static void main(String[] args) {
        System.out.println("Nhập số thứ nhất:");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        System.out.println("Nhập số thứ high:");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        for (int i = number1; i < number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(" Fizz -- Buzz " + i);
            } else if (i % 3 == 0) {
                System.out.println(" Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println(" Buzz " + i);
            }
        }
    }
}
