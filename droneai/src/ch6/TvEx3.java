package ch6;
class Tv3 {
    String color;   // 색상
    boolean power;  // 전원 상태
    int channel;    // 채널 번호

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class TvEx3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3();   // 첫 번째 인스턴스 생성
        Tv3 t2 = new Tv3();   // 두 번째 인스턴스 생성

        System.out.println("t1의 채널: " + t1.channel);
        System.out.println("t2의 채널: " + t2.channel);

        t2=t1;
        t1.channel = 7;
        System.out.println("t1의 채널을 7로 변경");

        System.out.println("t1의 채널: " + t1.channel);
        System.out.println("t2의 채널: " + t2.channel);
    }
}
