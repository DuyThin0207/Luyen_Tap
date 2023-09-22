package LuyenTap6;

import java.util.Scanner;

public class Lv_2 {
    public static void main(String[] args) {
        divisors();
    }

    public static void divisors() {
        System.out.println("Tìm ước số lẻ lớn nhất : ");
        Scanner divisor = new Scanner(System.in);
        int divisors = divisor.nextInt();
        int maxDivisors = 0;
        for (int i = 0; i <= divisors; i++) {
            int checkDivisors = divisors * i;
            if (divisors > maxDivisors && divisors % 2 == 1){
                maxDivisors = divisors;
                System.out.println(" Ước số lẻ lớn nhất của " + divisors + " là " + maxDivisors);
            } else if (checkDivisors % 2 == 0 && checkDivisors != 0) {
                System.out.println("Bội chẵn nhỏ nhất của " + divisors + " là " + checkDivisors);
                break;
            } else if (maxDivisors % 2 == 0) {
                System.out.println(" Không có ước số lẻ");
                int divisorsEven = divisors * 2;
                System.out.println(" Bội số lớn nhất của " + divisors + " là " + divisorsEven);
                break;
            }
        }
    }
}
