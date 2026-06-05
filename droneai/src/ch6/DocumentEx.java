package ch6;

class Document {
    static int count = 0;   // 클래스 변수: 전체 문서 수
    String name;            // 인스턴스 변수: 문서 이름

    Document() {
        this("제목없음" + ++count); // 기본 생성자 → 문서 번호 붙임
    }

    Document(String name) { 	//매개변수가 있는 생성자
        this.name = name;
        System.out.println("문서 \"" + this.name + "\"가 생성되었습니다.");
    }
}

class DocumentEx {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
