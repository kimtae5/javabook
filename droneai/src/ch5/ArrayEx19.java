package ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
            {100, 100, 100},   // 1번 학생
            {20, 20, 20},      // 2번 학생
            {30, 30, 30},      // 3번 학생
            {40, 40, 40},      // 4번 학생
            {50, 50, 50}       // 5번 학생
        };

        int korTotal = 0 , engTotal=0,mathTotal=0;
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==========================");
        

        // 학생별 총점과 평균, 과목별 총점 계산
        for (int i = 0; i < score.length; i++) {          // 학생 수만큼 반복
                int sum= 0;
                float avg = 0.0f;
                
                korTotal += score[i][0];
                engTotal += score[i][1];
                mathTotal += score[i][2];
                System.out.printf("%3d",i+1);
                
                for(int j=0;j<score[i].length;j++) {
                	sum += score[i][j];
                	System.out.printf("%5d",score[i][j]);
                }
                
                avg = sum/ (float)score[i].length;
                System.out.printf("%5d %5.1f%n",sum,avg);
            }
            System.out.println("=======================");
            System.out.printf("총점:%3d %4d %4d%n",korTotal,engTotal,mathTotal);

    }
}
