package LuyenTap7;

import java.util.Scanner;

public class Lv_1 {
    public static void main(String[] args) {
        Spell();
    }

    public static void Spell() {
        System.out.println("Nhập số nguyên chuyển thành chữ từ 1 -> 9: ");
        Scanner checkNum = new Scanner(System.in);
        int num = checkNum.nextInt();
        switch (num) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("High");
                break;
            case 3:
                System.out.println("Bar");
                break;
            case 4:
                System.out.println("四");
                break;
            case 5:
                System.out.println("Nem");
                break;
            case 6:
                System.out.println("六");
                break;
            case 7:
                System.out.println("Thất");
                break;
            case 8:
                System.out.println("Bát");
                break;
            case 9:
                System.out.println("Cửu");
                break;
            default:
                System.out.println("Not in 1 -> 9.");
        }
    }
}
