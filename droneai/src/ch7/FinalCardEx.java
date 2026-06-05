package ch7;
class Card2 {
    final int NUMBER;   // 상수지만, 선언만 하고 생성자에서 초기화
    final String KIND;  // 상수지만, 선언만 하고 생성자에서 초기화
    static int width =100;
    static int height = 250;
    
    Card2(String kind, int num) {
        KIND = kind;        // 생성자에서 한 번만 값 할당 가능
        NUMBER = num;       // 생성자에서 한 번만 값 할당 가능
    }
    
    Card2() {
		this("HEART", 1);
	}

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

class FinalCardEx {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
        Card2 c2 = new Card2("DIA", 15);
        System.out.println(c2);

        // c.NUMBER = 5;   // ❌ 컴파일 에러! final 변수는 값 변경 불가
    }
}
