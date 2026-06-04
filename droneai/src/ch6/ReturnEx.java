package ch6;

class ReturnEx {
    public static void main(String[] args) {
    	ReturnEx r = new ReturnEx();
    	
        int result = r.add(3, 5);   // 반환값이 있는 메서드
        System.out.println("반환값 있는 add() 결과: " + result);

        int[] result2 = {0};   // 반환값이 있는 메서드
        r.add(3, 5,result2);
        System.out.println("반환값 있는 add() 결과: " + result2[0]);// 반환값이 없는 메서드
    }

    // 반환값이 있는 메서드
    int add(int a, int b) {
        return a + b;   // 계산 결과를 호출한 쪽으로 돌려줌
    }

    // 반환값이 없는 메서드
    void add(int a, int b, int[] result) {
    	result[0] = a+b;
    }
}
