package ch6;

class FactorialEx2 {
	static long factorial(int n) {
		if (n <= 0 || n>20) {
			System.out.println("음수는 팩토리얼을 계산할 수 없습니다.");
			return -1; // 에러 코드 반환
		}
		if (n <= 1) {
			return 1; // 0! = 1 정의
		}
		return n * factorial(n - 1);
	}
	
    public static void main(String[] args) {
        int n = 21;
        long result = 0;
        for(int i=1;i<=n;i++) {
        	result=factorial(i);
        	
        	if(result==-1) {
        		System.out.printf("유효하지 않은 값.(0<n<=20):%d%n",n);
        		break;
        	}
        	System.out.printf("%2d!=%20d%n",i,result);
        }
    }
}
