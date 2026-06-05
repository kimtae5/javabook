package ch7;

class Tv {
    boolean power;   // 전원 상태
    int channel;     // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends Tv {   // Tv로부터 상속
    boolean caption;           // 자막 상태

    void displayCaption(String text) {
        if (caption) {         // 자막이 켜져 있을 때만 출력
            System.out.println(text);
        }
    }
}

class CaptionTvEx {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World"); // 자막 꺼져있음 → 출력 안 됨
        ctv.caption = true;                 // 자막 켜기
        ctv.displayCaption("Hello, World"); // 출력됨
    }
}
