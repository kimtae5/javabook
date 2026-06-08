package ch7;

public class SwitchEx {
    public static void main(String[] args) {
        System.out.println(getStringType(""));
        System.out.println(getStringType(" "));
        System.out.println(getStringType(null));
        System.out.println(getStringType("abc"));
        }
    
    static String getStringType(String str) {
    	String type = switch (str) {
			case null -> "null";
			case String s when s.isEmpty() -> "empty String";
			case String s when s.isBlank() -> "isBlank String";
//			case String s -> "String";
			default -> str;
    	};	
		return type;
    }
}
