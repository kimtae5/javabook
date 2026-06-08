package ch7;

public class InterfaceEx3 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.methodA();   // B는 I를 구현했으므로 전달 가능
    }
}

class A2 {
    void methodA() {
    	I2 i = InstanceManager.getInstance();// 매개변수 타입을 인터페이스로!
        i.methodB();  
        System.out.println(i.toString());// 인터페이스 규격만 알면 됨
    }
}
interface I2 {
    public abstract void methodB();
}

class B2 implements I2 {
    public void methodB() {
        System.out.println("B 클래스에서 play()");
    }
    public String toString() { return "class B";}
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}
