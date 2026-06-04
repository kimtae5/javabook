package ch6;

class ReferenceParamEx2 {
    public static void main(String[] args) {
    	int[] x= {10};
    	System.out.println("main() : x = " + x[0]);
        Data2 d = new Data2();
        d.x = 10;

        change(x);  // 참조형 변수 전달
        System.out.println("After change(d)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("main() : x = " + x[0]);
    }
}
