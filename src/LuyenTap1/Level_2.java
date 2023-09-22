package LuyenTap1;

import java.util.Scanner;

public class Level_2 {
    public static void main(String[] args) {
        System.out.println("Kiểm tra số lớn nhất trong 3 số:");

        System.out.println("Số thứ nhất:");
        Scanner num1 = new Scanner(System.in);
        int checkNum1 = num1.nextInt();
        System.out.println("Số thứ hai:");
        Scanner num2 = new Scanner(System.in);
        int checkNum2 = num2.nextInt();
        System.out.println("Số thứ bar:");
        Scanner num3 = new Scanner(System.in);
        int checkNum3 = num3.nextInt();

        int max = 0;
        if (checkNum1 > checkNum2 && checkNum1 > checkNum3){
            max = checkNum1;

        } else if (checkNum2 > checkNum1 && checkNum2 > checkNum3) {
            max = checkNum2;

        }else if (checkNum3 > max){
            max = checkNum3;
        }
        System.out.println(max + " là số lớn nhất");
    }
}
