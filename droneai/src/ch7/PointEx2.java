package ch7;

class PointEx2 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("x=" + p3.x + ", y=" + p3.y + ", z=" + p3.z);
	}
}

class Point2 {
    int x = 10;
    int y = 20;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point2 {
    int z = 30;

    Point3D2() {
        this(100,200,300);
    }
    
    Point3D2(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
}

