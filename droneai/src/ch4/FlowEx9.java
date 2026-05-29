package ch4;


import java.util.Scanner;

class FlowEx9 {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. (예: 011231-1111222)>");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char genderCode = regNo.charAt(7); // 뒷자리 첫 번째 숫자

        switch(genderCode) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("잘못된 주민등록번호입니다.");
        }

        scanner.close();
    }
}
