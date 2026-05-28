package ch02;

import java.util.*;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리정수를 하나 입력해>");
		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
		int num = scanner.nextInt();
		
		System.out.println("입력내용 : "+ input);
		System.out.println("num=%d%n : "+ num);
	}
}
