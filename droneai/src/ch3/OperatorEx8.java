package ch3;

class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;   // int 범위 초과 → 오버플로우 발생
        int b = 2_000_000;  // long 리터럴 사용 → 정상 계산

        long c = a*b;
        System.out.println(c);
    }
}




