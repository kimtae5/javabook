package ch7;

class A1 {
	void autoplay(I i) {   // 매개변수 타입을 인터페이스로!
		i.play();             // 인터페이스 규격만 알면 됨
	}
}
interface I {
    public abstract void play();
}

class B1 implements I {
    public void play() {
        System.out.println("play B 클래스");
    }
}

class C implements I{
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.autoplay(new B1());   // B는 I를 구현했으므로 전달 가능
        a.autoplay(new C());   // B는 I를 구현했으므로 전달 가능
    }
}
