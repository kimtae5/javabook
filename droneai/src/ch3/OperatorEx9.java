package ch3;

class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;    // int * int → int로 계산 후 long에 저장 → 오버플로우
        long b = 1_000_000 * 1_000_000L;   // long 리터럴 사용 → long으로 계산 → 정상 결과

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}





