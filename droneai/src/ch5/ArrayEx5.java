package ch5;



public class ArrayEx5 {
    public static void main(String[] args) {
    	int sum = 0;                           // 합계를 저장할 변수
    	float average = 0f;
        int[] score = {100, 88, 100, 100, 90}; // 점수 배열

        // 배열의 모든 값을 더하기
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float)score.length;

        // 출력
        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
