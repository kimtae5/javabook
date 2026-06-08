package ch7;

public class InstanceofEx2 {
    public static void main(String[] args) {
        Point2D p = new Point2D(0, 0);
        Point2D p2 = new Point2D(1, 1);
        Point2D p3 = new Point2D(0, 0);

        System.out.println("p = "+ p);       // false (서로 다른 객체)
        System.out.println("p2 = "+ p2);       // false (서로 다른 객체)
        System.out.println("p3 = "+ p3);       // false (서로 다른 객체)
        System.out.println("p.equals(p2)==" + p.equals(p2));  // false (equals 미구현 → 기본은 == 비교)
        System.out.println("p.equals(p3)==" + p.equals(p3));  // false (equals 미구현 → 기본은 == 비교)
    }
}

class Point2D {
    int x;
    int y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Object obj) {
    	return (obj instanceof Point2D p) && x == p.x && y == p.x;
		
	}
    public String toString() {
    	return "("+x+","+y+")";
    }
}
