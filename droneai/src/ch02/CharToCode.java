package ch02;

class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';              // 문자 'A' 저장
        int code = (int)ch;         // 문자 → 정수(유니코드 값) 변환
        System.out.printf("%c=%d(%#X)%n",ch,code,code);     // 출력: A
        char hch='가';
        
        System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);   // 출력: 65
    }
}
