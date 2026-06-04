package ch6;
class Car {
    String color;
    String gearType;
    int door;
    
    Car(){}

    // 매개변수가 있는 생성자
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;   // 매개변수 있는 생성자 호출
        Car c2 = new Car("white", "auto", 4);   // 다른 값으로 초기화

        System.out.println("c1.color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2.color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}
