package ch6;
class Card {
    String kind;          // 인스턴스 변수 (무늬)
    int number;           // 인스턴스 변수 (숫자)

    static int width = 100;   // 클래스 변수 (공통 속성)
    static int height = 250;  // 클래스 변수 (공통 속성)
}

public class CardEx {
    public static void main(String[] args) {
    	System.out.println("Card.width  = "+Card.width);
    	System.out.println("Card.height = "+Card.height);
    	
        Card c1 = new Card();   // 첫 번째 인스턴스
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();   // 두 번째 인스턴스
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1: " + c1.kind + ", " + c1.number +
                           " (크기: " + Card.width + "x" + Card.height + ")");
        System.out.println("c2: " + c2.kind + ", " + c2.number +
                           " (크기: " + Card.width + "x" + Card.height + ")");

        // 클래스 변수 변경
        System.out.println("c1ㅇ,ㅣ width와 height를 각각 50,80으로 변경합니다.");
        Card.width = 50;
        Card.height = 80;

        System.out.println("c1: " + c1.kind + ", " + c1.number +
                " (크기: " + Card.width + "x" + Card.height + ")");
        System.out.println("c2: " + c2.kind + ", " + c2.number +
                " (크기: " + Card.width + "x" + Card.height + ")");
    }
}
