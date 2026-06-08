package ch7;

class CastingEx {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();            // 가능 (실제 객체는 FireEngine)
        car = fe;              // 업캐스팅 (자동)
//        car.water();        // 불가능 (Car 타입에는 water() 없음)
        fe2 = (FireEngine) car; // 다운캐스팅 (명시적)
        fe2.water();
    }
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive,brrr");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
    void water() { System.out.println("물 뿌리기!"); }
}