package ch7;

class A {
    public void methodA(B b) {
    	b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("B 클래스의 method()");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
