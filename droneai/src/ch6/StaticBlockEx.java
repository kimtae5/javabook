package ch6;

class StaticBlockEx {
    static int[] arr = new int[10]; // 명시적 초기화: 배열 생성

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10)+1; // 클래스 초기화 블럭: 배열 요소 채움
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
