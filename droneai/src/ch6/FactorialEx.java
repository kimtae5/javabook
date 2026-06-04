package ch6;

class FactorialEx {
    public static void main(String[] args) {
        int result = factorial(4);   // 4! 계산
        System.out.println("4! = " + result);
    }

    static int factorial(int n) {
        int result = 0;
        if (n==1) {
        	result = 1;
        }else {
			result = n * factorial(n-1);
		}
        return result;
    }
}
