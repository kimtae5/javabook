package ch6;
class MyMath {
    // 덧셈 메서드
    long add(long a, long b) {
    	long result = a+b;
        return result;
    }

    // 뺄셈 메서드
    long subtract(long a, long b) {
        return a - b;
    }

    // 곱셈 메서드
    long multiply(long a, long b) {
        return a * b;
    }

    // 나눗셈 메서드
    double divide(double a, double b) {
        return a / b;
    }
}

public class MyMathEx {
    public static void main(String[] args) {
        MyMath mm = new MyMath();   // MyMath 인스턴스 생성

        long result1 = mm.add(5L, 3L);        // 덧셈
        long result2 = mm.subtract(5, 3);   // 뺄셈
        long result3 = mm.multiply(5, 3);   // 곱셈
        double result4 = mm.divide(5, 3);   // 나눗셈

        System.out.println("5 + 3 = " + result1);
        System.out.println("5 - 3 = " + result2);
        System.out.println("5 * 3 = " + result3);
        System.out.println("5 / 3 = " + result4);
    }
}
