package ch4;


public class FlowEx20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {              // 첫 번째 반복문
            for (int j = 1; j <= 3; j++) {          // 두 번째 반복문
                for (int k = 1; k <= 3; k++) {      // 세 번째 반복문
                    System.out.printf("i=%d, j=%d, k=%d%n", i, j, k);
                }
            }
        }
    }
}
