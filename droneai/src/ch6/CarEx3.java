package ch6;

class Car3 {
    String color;
    String gearType;
    int door;

    // 기본 생성자
    Car3() {
        this("white", "auto", 4);
    }
    // 다른 인스턴스를 복사하는 생성자
    Car3(Car3 c) {
    	color = c.color;
    	gearType = c.gearType;
    	door = c.door;
    }

    // 매개변수 있는 생성자
    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarEx3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();   // 원본 객체
        Car3 c2 = new Car3(c1);                    // 복사 생성자 호출

        System.out.println("c1.color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
        c1.door=100;
        System.out.println("c1.door=100; 수행후");
        System.out.println("c1.color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}
