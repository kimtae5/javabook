package ch7;

class CastingEx2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        car2 = fe;              // 업캐스팅 (자동)
        car2.drive();
    }
}
