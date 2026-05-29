package ch4;

import java.util.Scanner;

class FlowEx3 {
    public static void main(String[] args) {

        System.out.print("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else if (input == 1) {
            System.out.println("입력하신 숫자는 1입니다.");
        } else if (input == 2) {
            System.out.println("입력하신 숫자는 2입니다.");
        } else {
            System.out.println("0, 1, 2 가 아닙니다.");
        }
        scanner.close();
    }
}
