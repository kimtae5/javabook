package ch6;
class Tv {
    // 속성(필드)
    String color;   // 색상
    boolean power;  // 전원 상태 (on/off)
    int channel;    // 채널 번호

    // 메서드(행동)
    void power() { power = !power; }   // 전원 on/off 토글
    void channelUp() { ++channel; }    // 채널 증가
    void channelDown() { --channel; }  // 채널 감소
}

public class TvEx {
    public static void main(String[] args) {
        Tv t = new Tv();   // Tv 클래스의 인스턴스 생성

        // 인스턴스의 속성 사용
        t.channel = 7;
        System.out.println("현재 채널: " + t.channel);

        // 인스턴스의 메서드 사용
        t.channelDown();
        System.out.println("채널 내림 후: " + t.channel);

        t.power(); // 전원 켜기
        System.out.println("TV 전원 상태: " + t.power);
    }
}
