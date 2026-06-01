package ch5;

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP"; // 변환할 문자열

        // 알파벳 A~Z에 대응되는 모스부호 테이블
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
        };

        String result = "";

        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);   // i번째 문자 꺼내기
            // 'A'를 0으로 맞추기 위해 'A'를 빼줌
            result += morse[ch - 'A'] + " ";
        }

        System.out.println("source: " + source);
        System.out.println("morse: " + result);
    }
}
