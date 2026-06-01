package ch5;


public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'}; // 16진수 문자 배열
        String[] binary = {               // 16진수 → 2진수 매핑
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };

        String result = "";

        for (int i = 0; i < hex.length; i++) {
        	if(hex[i]>='0' && hex[i]<='9'  ) {
        		result += binary[hex[i]-'0'];
        	} else {
				result+= binary[hex[i]-'A'+10];
			}
            // 16진수 문자를 정수로 변환
//            int decimal = Character.digit(hex[i], 16);
//            // 해당하는 2진수 문자열을 이어붙임
//            result += binary[decimal];
        }

        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
    }
}
