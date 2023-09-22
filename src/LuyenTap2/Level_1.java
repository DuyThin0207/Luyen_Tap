package LuyenTap2;

import java.util.Scanner;

public class Level_1 {
    public static void main(String[] args) {
        System.out.println("Nhập số bánh cần rán: ");
        Scanner num = new Scanner(System.in);
        int checkNum = num.nextInt();
        int i;
        i = checkNum / 9;
        if (checkNum > 10000) {
            System.out.println(" Định kinh doanh xuất khẩu bánh rán à br ? ");
        } else if (checkNum - 9 * i == 0) {
            System.out.println(checkNum + " bánh cần rán số lần là " + i);
        } else if (checkNum / 9 != 0) {
            System.out.println(checkNum + " bánh cần rán số lần là " + (i + 1));
        } else if (checkNum >= 1 && checkNum < 9) {
            System.out.println(checkNum + " bánh cần rán số lần là " + 1);
        }
    }
}
