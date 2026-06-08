package ch7;

public class FighterEx {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
        	System.out.println("f는 유닛 클래스의 자손");
        if(f instanceof Fightable)
        	System.out.println("f는 Fightable인터페이스");
        if(f instanceof Movable)
        	System.out.println("f는 Movable 인터페이스");
        if(f instanceof Attackable)
        	System.out.println("f는 Attackable 인터페이스");
        if(f instanceof Object)
        	System.out.println("f는 Object 클래스의 자손");
    }
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("[" + x + "," + y + "] 위치로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격!");
    }
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{}           // 인터페이스 선언
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u);}
