package ch4;


class FlowEx16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                "%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
                i,          // 현재 값
                2 * i,      // 짝수 (2*i)
                2 * i - 1,  // 홀수 (2*i+1)
                i * i,      // 제곱 (i*i)
                11 - i,     // 역순 (11-i)
                i % 3,      // 순환 (i%3)
                i / 3       // 반복 (i/3)
            );
        }
    }
}
