package ch4;


public class FlowEx22 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {        // 바깥 반복문: i를 1~5까지 증가
            for (int j = 1; j <= 5; j++) { 
            	if (i==j) {
            		System.out.printf(" [%d, %d] ", i, j);
            	} else {
            		System.out.printf(" %5c", ' ');
				}
            }
            System.out.println(); // 한 줄 끝나면 줄바꿈
        }
    }
}
