package LuyenTap4;

import java.util.Scanner;

public class Lv_2 {
    public static void main(String[] args) {
        System.out.println("Tính tổng các số chẵn từ A -> B \n Nhập số thứ nhất");
        Scanner num1 = new Scanner(System.in);
        int checkNum1 = num1.nextInt();
        System.out.println("Nhập số thứ high");
        Scanner num2 = new Scanner(System.in);
        int checkNum2 = num2.nextInt();

        int evenNum = 0;
        for (int i = checkNum1; i <= checkNum2 ; i++) {
            if (i % 2 == 0 ){
                evenNum += i;
            }
        }System.out.println("Tổng số chẵn từ A -> B là: " + evenNum);
    }
}
