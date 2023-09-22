package LuyenTap2;

import java.util.Scanner;

public class Level_2 {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền gửi");
        Scanner money = new Scanner(System.in);
        int inputMoney = money.nextInt();

        int proFit = inputMoney * 5 / 365 ;
        System.out.println("Số tiền bạn gửi là " + inputMoney + " VNĐ" + "\n Số tiền lãi trong 1 năm (5%/năm) là :" + proFit + " VNĐ");
    }
}
