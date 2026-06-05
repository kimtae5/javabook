package ch7;
class Singleton {
    // 유일한 인스턴스를 저장할 static 변수
    private static Singleton s = new Singleton();

    // 생성자를 private으로 해서 외부에서 new로 생성 못하게 막음
    private Singleton() {System.out.println("singleton!!");}

    // 유일한 인스턴스를 반환하는 public 메서드
    public static Singleton getInstance() {
    	if(s==null)
    		s = new Singleton();
        return s;
    }
}

class SingletonEx {
    public static void main(String[] args) {
        // Singleton 객체를 직접 new로 만들 수 없음
        // Singleton s = new Singleton(); ❌ 컴파일 에러
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }
}
