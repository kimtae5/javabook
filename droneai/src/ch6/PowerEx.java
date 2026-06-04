package ch6;

class PowerEx {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        long result = 0;
        
        for(int i=1;i<=n;i++) {
        	result += power(x, i);
        }
        System.out.println("x^1 + x^2 + ... + x^" + n + " = " + result);
    }

    // 재귀 호출로 x^1부터 x^n까지의 합 계산
    static int power(int x, int n) {
        if (n == 1) return x;                // 종료 조건
        return x * power(x, n - 1);
    }
}

