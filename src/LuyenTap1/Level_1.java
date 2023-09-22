package LuyenTap1;

import java.util.Scanner;

public class Level_1 {
    public static void main(String[] args) {
            System.out.println("Nhập số muốn kiểm tra là chẵn hay lẻ: ");
            Scanner inputNum = new Scanner(System.in);
            int checkNum = inputNum.nextInt();
            if (checkNum%2==0){
                System.out.println("Đây là số chẵn.");
            }else {
                System.out.println("Đây là số lẻ.");
            }
        }
    }
