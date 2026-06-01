package ch5;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];   // 1~45까지 숫자를 담을 배열

        // 1~45까지 숫자 채우기
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        // 배열 섞기 (shuffle)
        for (int i = 0; i < 6; i++) {
            int j = (int)(Math.random() * 45); // 0~44 사이 난수
            // swap
            int temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i=0; i< 6;i++) {
        	System.out.printf("ball[%d]=%d%n",i,ball[i]);
        }
        // 앞에서부터 6개 출력
        int[] lotto = Arrays.copyOf(ball, 6);
        System.out.println("로또 번호: " + Arrays.toString(lotto));
    }
}
