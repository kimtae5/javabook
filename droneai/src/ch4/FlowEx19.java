package ch4;


public class FlowEx19 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {            // 바깥 for문: 단(2~9단)
            for (int j = 1; j <= 9; j++) {        // 안쪽 for문: 곱하는 수(1~9)
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); // 각 단이 끝나면 줄바꿈
        }
    }
}
