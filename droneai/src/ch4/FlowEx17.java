package ch4;


class FlowEx17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {          // 줄(행) 반복
            for (int j = 1; j <= i; j++) {      // 각 줄에서 별 개수 반복
                System.out.print("*");
            }
            System.out.println();               // 줄 바꿈
        }
    }
}
