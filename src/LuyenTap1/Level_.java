package LuyenTap1;

import java.util.Scanner;

public class Level_ {
    public static void main(String[] args) {
        System.out.println("Kiểm tra loại tam giác:");

        System.out.println("Nhập cạnh A:");
        Scanner num1 = new Scanner(System.in);
        int checkNum1 = num1.nextInt();
        System.out.println("Nhập cạnh B:");
        Scanner num2 = new Scanner(System.in);
        int checkNum2 = num2.nextInt();
        System.out.println("Nhập cạnh C:");
        Scanner num3 = new Scanner(System.in);
        int checkNum3 = num3.nextInt();

        if (checkNum1 == checkNum2 && checkNum1 == checkNum3){
            System.out.println("Đây là Tam Giác Đều.");
        }else if (checkNum1 == checkNum2 || checkNum1 == checkNum3){
            System.out.println("Đây là Tam Giác Cân");
        } else if (checkNum1 != checkNum2 && checkNum1 != checkNum3) {
            System.out.println("Đây là Tam Giác Thường");
        }
    }
}
