package LuyenTap2;

import java.util.Scanner;

public class Level_3 {
    public static void main(String[] args) {
        System.out.println("Kiểm tra xếp loại học lực của bạn: ");
        Scanner point = new Scanner(System.in);
        int checkPoint = point.nextInt();

        if (checkPoint > 100 || checkPoint <= 0) {
            System.out.println("Điểm tối đa là 100 và tối thiểu là 0. Mời bạn nhập lại.");
        } else if (checkPoint >= 85) {
            System.out.println(" Bạn đã đạt học sinh giỏi. Xin chúc mừng bạn.");
        } else if (checkPoint >= 50) {
            System.out.println(" Học lực của bạn xếp loại trung bình. Bạn hãy cố gắng hơn nữa.");
        } else {
            System.out.println(" Xếp loại của bạn là YẾU. Bạn cần cố gắng và phấn đấu để đạt xếp loại cao hơn");
        }
    }
}
