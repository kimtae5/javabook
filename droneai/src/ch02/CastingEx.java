package ch02;

class CastingEx {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;        // double → int (소수점 버려짐)
        System.out.println("score = " + score);
        System.out.println("d = " + d);
    }
}

