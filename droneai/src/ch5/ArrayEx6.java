package ch5;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95}; // 점수 배열

        int max = score[0]; // 첫 번째 값을 기준으로 초기화
        int min = score[0];

        // 배열을 순회하면서 최대값과 최소값 찾기
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }else if (score[i] < min){
            	 min = score[i];
			}
            
        }

        // 출력
        System.out.println("배열: " + Arrays.toString(score));
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
