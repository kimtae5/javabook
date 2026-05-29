package ch4;

import java.util.Scanner;

class FlowEx7 {
    public static void main(String[] args) {
        int user, com;

        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextInt();

        com = (int)(Math.random() * 3) + 1; // 1~3 무작위 값
        System.out.println((Math.random()));
        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + com + "입니다.");
        
        switch(user - com) {
        case 0:
            System.out.println("비겼습니다.");
            break;
        case 1: case -2:
            System.out.println("당신이 이겼습니다.");
            break;
        case -1: case 2:
            System.out.println("당신이 졌습니다.");
            break;
    }

//        if (user == com) {
//            System.out.println("비겼습니다.");
//        } else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
//            System.out.println("당신이 이겼습니다.");
//        } else {
//            System.out.println("당신이 졌습니다.");
//        }

        scanner.close();
    }
}
