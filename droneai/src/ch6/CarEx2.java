package ch6;

class Car2 {
    String color;
    String gearType;
    int door;

    // 기본 생성자
    Car2() {
        this("white", "auto", 4);   // 다른 생성자 호출
    }
    
    Car2(String color) {
        this(color, "auto", 4);   // 기본값을 지정해서 다른 생성자 호출
    }

    // 매개변수 있는 생성자
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarEx2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();                       // 기본 생성자 호출 → 내부에서 다른 생성자 호출
        Car2 c2 = new Car2("blue");     // 매개변수 있는 생성자 직접 호출

        System.out.println("c1.color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}
