package ch4;


public class FlowEx25 {
    public static void main(String[] args) {
    	int i=11;
    	System.out.println("카운트다운을 시작");
    	while (i-- != 0) {   // i가 0 이상일 때 반복
            System.out.println(i);  // 현재 값 출력
            for(long j=0;j<1_000_000_000L;j++) {
            	;
            }
        }
    	System.out.println("Game Over");
    }
}
