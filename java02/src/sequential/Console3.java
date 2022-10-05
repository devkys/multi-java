package sequential;

import java.util.Scanner;

public class Console3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나의 이름은?");
        String name = in.next();
        System.out.print("나의 키는?");
        double height = in.nextDouble();
        System.out.print("나의 몸무게는?");
        double weight = in.nextDouble();
        System.out.print("나는 저녁을 먹었나요?");
        boolean dinner = in.nextBoolean();
        in.nextLine();
        System.out.print("나의 좌우명은 ? ");
        String plan = in.nextLine();
        System.out.println(" ----------------------------- ");
        System.out.println("내 이름은 " + name + "입니다. ");
        System.out.println("내 내년 키는  " + (height + 10.0) + "입니다. ");
        System.out.println("내 내년 몸무게는  " + (weight - 10.0) + "입니다. ");
        System.out.println("나는 저녁을 " + dinner + "입니다. ");
        System.out.println("나의 좌우명은 " + plan + "입니다. ");
        in.close();
    }
}




