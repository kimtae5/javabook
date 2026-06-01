package ch4;


public class FlowEx21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {        // 바깥 반복문: i를 1~5까지 증가
            for (int j = 1; j <= 5; j++) {    // 안쪽 반복문: j를 1~5까지 증가
                System.out.printf("[%d, %d] ", i, j);
            }
            System.out.println(); // 한 줄 끝나면 줄바꿈
        }
    }
}
