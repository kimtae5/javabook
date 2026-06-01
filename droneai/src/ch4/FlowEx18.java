package ch4;


import java.util.Scanner;

public class FlowEx18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 라인의 수를 입력하세요: ");
        int lines = scanner.nextInt();   // 사용자 입력 받기

        for (int i = 0; i < lines; i++) {        // i는 라인 수 제어
            for (int j = 0; j <= i; j++) {       // j는 별 개수 제어
                System.out.print("*");
            }
            System.out.println();                // 줄바꿈
        }
        scanner.close();
    }
}
