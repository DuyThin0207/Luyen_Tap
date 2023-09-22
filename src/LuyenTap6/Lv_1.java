package LuyenTap6;

import java.util.Scanner;

public class Lv_1 {
    public static void main(String[] args) {
        divisors();
    }

    public static void divisors() {
        System.out.println("Nhap ước số muốn tìm : ");
        Scanner divisor = new Scanner(System.in);
        int divisors = divisor.nextInt();

        for (int i = 0; i <= divisors; i++) {
            int checkDivisors = divisors * i;
            System.out.println("Các ước số nguyên dương của " + divisors + " là " + i);

            if (checkDivisors < 100){
                System.out.println(" có bội nhỏ hơn 100 là : " + checkDivisors);
            }
        }
    }
}
