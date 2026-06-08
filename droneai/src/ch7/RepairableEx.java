package ch7;

class RepairableEx {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);     // Tank는 Repairable → 수리 가능
        scv.repair(dropShip);       // DropShip도 Repairable → 수리 가능
//        scv.repair(marine); // Marine은 Repairable 아님 → 컴파일 에러
    }
}

interface Repairable {}   // '수리 가능' 표시용 인터페이스

class Unit1 {
    int hitPoint;          // 현재 체력
    final int MAX_HP;      // 최대 체력

    Unit1(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit1 {
    GroundUnit(int hp) { super(hp); }
}

class AirUnit extends Unit1 {
    AirUnit(int hp) { super(hp); }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
    	super(150);
    	hitPoint = MAX_HP;
    }
    public String toString() { return "Tank"; }
}

class DropShip extends AirUnit implements Repairable {
    DropShip() {
    	super(125);
    	hitPoint = MAX_HP;
	}
    public String toString() { return "DropShip"; }
}

class Marine extends GroundUnit {
    Marine() {
    	super(40);
    	hitPoint = MAX_HP;
	}
    public String toString() { return "Marine"; }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
    	super(60);
    	hitPoint = MAX_HP;
	}

    void repair(Repairable r) {
        if(r instanceof Unit1 u) {
            while(u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}

