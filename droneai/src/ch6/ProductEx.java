package ch6;

class Product {
    static int count = 0;   // 클래스 변수: 전체 제품 수 카운트
    int serialNo;           // 인스턴스 변수: 각 제품의 고유 번호

    {
        ++count;            // 인스턴스 초기화 블럭: 객체 생성 시 실행
        serialNo = count;   // 일련번호 부여
    }

    public Product() {}     // 생성자
}

class ProductEx {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
//        for(int i=5;i<=10;i++) {
//        	Product i = new Product();
//        	System.out.printf("p%d의 제품번호: %d%n", i.serialNo  );
//        }
        System.out.println("p1의 제품번호: " + p1.serialNo);
        System.out.println("p2의 제품번호: " + p2.serialNo);
        System.out.println("p3의 제품번호: " + p3.serialNo);
        System.out.println("생산된 제품 수: " + Product.count);
    }
}
